import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        //see the README.md of this project to get the login configured
        LoginAuth login = new LoginAuth("EMAIL", "PASSWORD", "MzRhMDJjZjhmNDQxNGUyOWIxNTkyMTg3NmRhMzZmOWE6ZGFhZmJjY2M3Mzc3NDUwMzlkZmZlNTNkOTRmYzc2Y2Y", "ZWM2ODRiOGM2ODdmNDc5ZmFkZWEzY2IyYWQ4M2Y1YzY6ZTFmMzFjMjExZjI4NDEzMTg2MjYyZDM3YTEzZmM4NGQ");

        API auth = new API(login);

        try {
            auth.auth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            auth.getStats(auth.getId("Ninja")); //returns stats of the user
            auth.getAllStoreItems(); //returns the current item shop
            auth.getStatus(); //returns the status of the game, up or down
            auth.getNews(); //returns the news from Epic Games
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
