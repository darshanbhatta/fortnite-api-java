import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class API {

    private LoginAuth login;
    private HttpRequestFactory factory;
    private ScheduledExecutorService scheduler;

    private String authURL = "https://account-public-service-prod03.ol.epicgames.com/account/api/oauth/token";

    private String[] endpoints = {"grant_type", "username", "password", "includePerms"};
    private String[] values = {"password", "", "", "true"};
    private String acessToken;

    public API(LoginAuth login) {
        this.login = login;
        this.factory = new NetHttpTransport().createRequestFactory();
        this.scheduler = Executors.newScheduledThreadPool(0);

        values[1] = login.getEmail();
        values[2] = login.getPassword();

    }


    //authenticates user and gets tokens, used to call the other requests
    public void auth() throws IOException {
        GenericUrl tokenUrl = new GenericUrl(authURL);
        String initialLoginPayload = urlFormer(endpoints, values);

        ByteArrayContent initLog = new ByteArrayContent("application/x-www-form-urlencoded", initialLoginPayload.getBytes());
        HttpRequest initReq = factory.buildPostRequest(tokenUrl, initLog);
        initReq.getHeaders().setAuthorization("basic " + login.getHash());
        String initialLoginResponse = initReq.execute().parseAsString();

        acessToken = initialLoginResponse.substring(initialLoginPayload.indexOf("access_token") + 23, initialLoginResponse.indexOf(",") - 1);

        String authExchangeEndpoint = "https://account-public-service-prod03.ol.epicgames.com/account/api/oauth/exchange";
        GenericUrl exchangeUrl = new GenericUrl(authExchangeEndpoint);
        HttpRequest exchangeRequest = factory.buildGetRequest(exchangeUrl);
        exchangeRequest.getHeaders().setAuthorization("bearer " + acessToken);

        String exRes = exchangeRequest.execute().parseAsString();
        String exCode = exRes.substring(exRes.indexOf("code") + 9, exRes.lastIndexOf(",") - 1);
        String[] types = {"grant_type", "exchange_code", "includePerms", "token_type"};
        String[] vals = {"exchange_code", exCode, "true", "eg1"};
        String exchangeTokenPayload = urlFormer(types, vals);

        ByteArrayContent exToken = new ByteArrayContent("application/x-www-form-urlencoded", exchangeTokenPayload.getBytes());
        HttpRequest exTokenReq = factory.buildPostRequest(tokenUrl, exToken);
        exTokenReq.getHeaders().setAuthorization("basic " + login.getHashClient());

        String exchangeTokenResponse = exTokenReq.execute().parseAsString();
        acessToken = exchangeTokenResponse.substring(exchangeTokenResponse.indexOf("access_token") + 17, exchangeTokenResponse.indexOf(",") - 1);

    }

    //forms a formatted url to authenticate
    private String urlFormer(String[] keys, String[] values) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < keys.length; i++) {
            sb.append("&");
            sb.append(keys[i]);
            sb.append("=");
            sb.append(values[i]);
        }

        return sb.toString().substring(1);
    }

    //gets the id of the user based on username, used to find stats of the user
    public String getId(String username) throws IOException {
        GenericUrl url = new GenericUrl("https://persona-public-service-prod06.ol.epicgames.com/persona/api/public/account/lookup?q=" + username);
        HttpRequest request = factory.buildGetRequest(url);
        request.getHeaders().setAuthorization("bearer " + acessToken);

        String json = "";
        try {
            json = request.execute().parseAsString();
        } catch (Exception e) {
            System.out.println("\nError, cannot find user");
            return "";

        }

        return json.substring(json.indexOf("id") + 7, json.indexOf(",") - 1);
    }

    //gets the stats of the user
    public void getStats(String userId) throws IOException {
        if (!userId.equals("")) {
            GenericUrl url = new GenericUrl("https://fortnite-public-service-prod11.ol.epicgames.com/fortnite/api/stats/accountId/" + userId + "/bulk/window/alltime");
            HttpRequest request = factory.buildGetRequest(url);
            request.getHeaders().setAuthorization("bearer " + acessToken);

            String json = request.execute().parseAsString();

            RawData[] rawStats = new Gson().fromJson(json, new TypeToken<RawData[]>() {}.getType());
            StringBuilder gson = new StringBuilder();
            for (int x = 0; x < rawStats.length; x++) {
                gson.append(",\"").append(rawStats[x].getName()).append("\":").append(rawStats[x].getValue());
            }

            String jsonStats = "{" + gson.toString().substring(1) + "}";

            StatsPC statsPC = new Gson().fromJson(jsonStats, StatsPC.class);
            StatsXB1 statsXB1 = new Gson().fromJson(jsonStats, StatsXB1.class);
            StatsPS4 statsPS4 = new Gson().fromJson(jsonStats, StatsPS4.class);

            if (statsPC.hasAccount()) {
                statsPC.calc();
                System.out.println(statsPC.lifeTime());
                System.out.println(statsPC.soloStat());
                System.out.println(statsPC.duoStat());
                System.out.println(statsPC.squadStat());
            }
            if (statsXB1.hasAccount()) {
                statsXB1.calc();
                System.out.println(statsXB1.lifeTime());
                System.out.println(statsXB1.soloStat());
                System.out.println(statsXB1.duoStat());
                System.out.println(statsXB1.squadStat());
            }
            if (statsPS4.hasAccount()) {
                statsPS4.calc();
                System.out.println(statsPS4.lifeTime());
                System.out.println(statsPS4.soloStat());
                System.out.println(statsPS4.duoStat());
                System.out.println(statsPS4.squadStat());
            }

        }

    }

    //gets all the current items in the item shop and their prices
    public void getAllStoreItems() throws IOException {
        GenericUrl url = new GenericUrl("https://fortnite-public-service-prod11.ol.epicgames.com/fortnite/api/storefront/v2/catalog?rvn=5479");
        HttpRequest request = factory.buildGetRequest(url);
        request.getHeaders().setAuthorization("bearer " + acessToken);

        String json = request.execute().parseAsString();
        JSONObject obj = new JSONObject(json);
        JSONArray arr = obj.getJSONArray("storefronts");

        System.out.println("\nITEM SHOP\n");
        System.out.println("Featured Items");

        for (int x = 0; x < arr.getJSONObject(2).getJSONArray("catalogEntries").length(); x++) {
            System.out.println(storeNameFormatter(arr.getJSONObject(2).getJSONArray("catalogEntries").getJSONObject(x).get("devName").toString()));
        }

        System.out.println("\nDaily Items");

        for (int x = 0; x < arr.getJSONObject(10).getJSONArray("catalogEntries").length(); x++) {
            System.out.println(storeNameFormatter(arr.getJSONObject(10).getJSONArray("catalogEntries").getJSONObject(x).get("devName").toString()));

        }

    }

    //formats the item name and price
    public String storeNameFormatter(String name) {
        String format = (name.substring((name.indexOf("x") + 2), (name.indexOf("for") - 1))).trim() + "(" + name.substring(name.indexOf("for") + 3, name.indexOf("MtxCurrency")).trim() + " V-Bucks)";

        if (format.contains(",")) {
            format = format.substring(0, format.indexOf(",")) + format.substring(format.indexOf("("));

        }

        return format;

    }

    //gets the news from the Epic Games' blog
    public void getNews() throws IOException {
        GenericUrl url = new GenericUrl(" https://www.epicgames.com/fortnite/api/blog/getPosts");
        HttpRequest request = factory.buildGetRequest(url);

        String json = request.execute().parseAsString();
        JSONObject obj = new JSONObject(json);
        JSONArray arr = obj.getJSONArray("blogList");

        System.out.println("\nNEWS\n");

        for (int x = 0; x < arr.length(); x++) {
            System.out.println((arr.getJSONObject(x).get("image")) + " \n" + arr.getJSONObject(x).get("title") + "\n" + arr.getJSONObject(x).get("date").toString().substring(0, arr.getJSONObject(x).get("date").toString().indexOf("T")) + "\n" + "https://www.epicgames.com/fortnite/en-US" + arr.getJSONObject(x).get("urlPattern") + "\n");
        }

    }

    //gets the status of the game, down or not
    public void getStatus() throws IOException {
        GenericUrl url = new GenericUrl("https://lightswitch-public-service-prod06.ol.epicgames.com/lightswitch/api/service/bulk/status?serviceId=Fortnite");
        HttpRequest request = factory.buildGetRequest(url);
        String json = request.execute().parseAsString();
        System.out.println("\nFortnite is "+(json.substring((json.indexOf("\"status\":") + 10), (json.indexOf(",\"message\":")-1)).toLowerCase()));

    }

}
