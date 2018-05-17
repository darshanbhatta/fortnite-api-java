# fortnite-api-java

Get player stats, store info, news, and status check in Fortnite all written in Java

## Installation 

```
git clone https://github.com/darshanbhatta/fortnite-api-java.git
```

## Using the API

### Getting the tokens (if no longer working)

If you get a login fail error, you might need to find the Launcher Token and the Fortnite Client Token.

1.  <a href="https://www.telerik.com/download/fiddler/fiddler4">Download and open Fiddler</a>
2.  Tools - Options - HTTPS, select Capture HTTPS Connects and select Decrypt HTTPS traffic
3.  Start Epic Games Launcher
4.  After that start your Epic Games launcher.
5.  Look for /account/api/oauth/token, this is your Launcher Token (called hash in the program)
![image](https://user-images.githubusercontent.com/36747258/40150907-2099d586-5942-11e8-820d-8ccd722b53df.png)
6.  Press f12 to stop the scan
7.  Launch the game
8.  When you are on the loading screen, press f12 again
9.  Look for /account/api/oauth/token (different from step 5), this is your Fortnite Client Token (called hashClient in the program)

---

### Setting up

Replace "EMAIL" and "PASSWORD" with your Epic Games details

```java
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
```

---

### Methods

* getStats(String)

Gets the stats of the user, have to call getId(String) to get the ID of the user to return Stats

```java
  try {
            auth.auth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            auth.getStats(auth.getId("Ninja")); //returns stats of the user
        } catch (IOException e) {
            e.printStackTrace();
        }
});
```

```js
LIFETIME STATS PC
Wins: 2692
Top 10/5/3: 3358
Top 25/12/6: 4003
Kills: 56220
K/D: 11.13
K/match: 7.26
Matches: 7743
Win %: 34.77


SOLO STATS PC
Wins: 1185
Top 10: 1556
Top 25: 1869
Kills: 26670
K/D: 11.78
K/match: 7.73
Matches: 3449
Win %: 34.36


DUO STATS PC
Wins: 1169
Top 5: 1372
Top 12: 1611
Kills: 19965
K/D: 12.64
K/match: 7.26
Matches: 2749
Win %: 42.52


SQUAD STATS PC
Wins: 338
Top 3: 430
Top 6: 523
Kills: 9585
K/D: 7.94
K/match: 6.2
Matches: 1545
Win %: 21.88

```

* getAllStoreItems()

Gets the current items in the Fortnite Item Shop

```java
        try {
            auth.auth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            auth.getAllStoreItems(); //returns the current item shop
        } catch (IOException e) {
            e.printStackTrace();
        }
});
```

```js
ITEM SHOP

Featured Items
Highland Warrior(1500 V-Bucks)
Bear Force One(1500 V-Bucks)

Daily Items
Finger Guns(200 V-Bucks)
Radiant Striker(1200 V-Bucks)
Checker(500 V-Bucks)
Brite Bomber(1200 V-Bucks)
Flippin Sexy(500 V-Bucks)
Pink Flamingo(1500 V-Bucks)
```

* getStatus()

Gets the current status of Fortnite, up or down

```java
        try {
            auth.auth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
           auth.getStatus(); //returns the status of the game, up or down
        } catch (IOException e) {
            e.printStackTrace();
        }
});
```

```js
Fortnite is up
```



* getNews()

Gets Fortnite news from Epic Games

```java
      try {
            auth.auth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            auth.getNews(); //returns the news from Epic Games
        } catch (IOException e) {
            e.printStackTrace();
        }
```

```java
NEWS

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv4-2-patch-notes%2FSolidGoldv2_FeaturedThumbnail-1920x480-c9f94c72e64c3604e0138e4cae0a4700481b97b8.jpg 
v4.2 Patch Notes
2018-05-15
https://www.epicgames.com/fortnite/en-US/blog/v4-2-patch-notes

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fitem-perk-recombobulator%2FBR04_News_Thumbnail_PerkRecombobulator-1920x480-26f5e7b6b52a5fdbadb474baa0f4998516de0c58.jpg 
Item Perk Recombobulator
2018-05-10
https://www.epicgames.com/fortnite/en-US/blog/item-perk-recombobulator

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv4-1-patch-notes%2FInfinityGauntlet_Thumbnail-345x200-5e0cfe7a4b19cff1d97ad2a26f0d0b62ff69b1e8.jpg 
v4.1 Patch Notes
2018-05-08
https://www.epicgames.com/fortnite/en-US/blog/v4-1-patch-notes

https://cdn2.unrealengine.com/Fortnite%2FEN_BR04_News_Thumbnail_Infinity-Gauntlet-LTM-MashUp-1920x480-f5b817c4a64b46494b4b8539d1b05d2dfc6fcbb7.jpg 
infinity gauntlet
2018-05-07
https://www.epicgames.com/fortnite/en-US/blog/infinity-gauntlet

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv4-0-patch-notes%2FBattlePass_FeaturedThumbnail-1920x480-098bc30c140dd6f25eb263f272da965bbf5cc2cc.jpg 
v4.0 Patch Notes - Season 4 is HERE!
2018-04-30
https://www.epicgames.com/fortnite/en-US/blog/v4-0-patch-notes

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fpostmortem-of-service-outage-4-12%2FFN03_News_Thumbnail_Small_Outage_04112018-345x200-821482417f2ec035742755a9d7ac9eda5573a931.jpg 
POSTMORTEM OF SERVICE OUTAGE 4/11/2018 - 4/12/2018
2018-04-26
https://www.epicgames.com/fortnite/en-US/blog/postmortem-of-service-outage-4-12

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv3-6-patch-notes%2FClinger_Thumbnail-345x200-1e9626dff79e657b55ce93e9a1e6c1ca9f977ead.jpg 
v3.6 Patch Notes
2018-04-24
https://www.epicgames.com/fortnite/en-US/blog/v3-6-patch-notes

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv3-5-content-update%2FLMG_Thumbnail-345x200-f59b22108195cb7f1c3f95b91bab15d5618a3c17.jpg 
v3.5 Content Update | Light Machine Gun
2018-04-18
https://www.epicgames.com/fortnite/en-US/blog/v3-5-content-update

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Freplay-royale-contest%2FReplayRoyale_FeaturedThumbnail-1920x480-14c240a1a0ab8ac1fb1e6a47ba32899b56fbb78b.jpg 
Replay Royale Contest
2018-04-13
https://www.epicgames.com/fortnite/en-US/blog/replay-royale-contest

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Freplay-royale-contest%2FReplayRoyale_Thumbnail-345x200-e8fa0448f4955ac0f51f090aed3749e9b4445bfa.jpg 
Replay Royale Contest Rules
2018-04-13
https://www.epicgames.com/fortnite/en-US/blog/replay-royale-contest-rules

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fextended-instability-and-downtime-4-11%2FFN_News_Thumbnail-1920x480-011703b73a7d02af8e567316abcfb68408d33c9a.jpg 
Extended Instability and Downtime (4/11)
2018-04-12
https://www.epicgames.com/fortnite/en-US/blog/extended-instability-and-downtime-4-11

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Ffortnite-battle-royale-replay-system%2FFN_News_Featured-Header_Small-375x200-a6de3e8aad6e172c836a05738b53a511295384d9.jpg 
Fortnite Battle Royale - Replay System
2018-04-11
https://www.epicgames.com/fortnite/en-US/blog/fortnite-battle-royale-replay-system

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv3-5-patch-notes%2F50v50v2_Thumbnail-345x200-becdb655199b752dcae005ca0ce620dd1d09d626.jpg 
v3.5 Patch Notes
2018-04-11
https://www.epicgames.com/fortnite/en-US/blog/v3-5-patch-notes

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fsurvive-thunder-route-99%2FFN_Blog_AridSurvival_Thumbnail_Small-345x200-0267d59bf6b26419b7f79b6860ac695d55d9bb61.jpg 
Survive Thunder Route 99
2018-04-06
https://www.epicgames.com/fortnite/en-US/blog/survive-thunder-route-99

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fv3-4-content-update%2FVendingMachine_Thumbnail-345x200-730608f3f08b43a047ececea5e72fbc329026174.jpg 
v3.4 Content Update | Vending Machine
2018-04-04
https://www.epicgames.com/fortnite/en-US/blog/v3-4-content-update

https://cdn2.unrealengine.com/Fortnite%2Fblog%2Fboogiedown-contest-rules%2FFN_News_Thumbnail_Small_BoogieDown-345x200-633b3b20f68a9aa712cdfc8d48ec9122da13c178.jpg 
boogiedown contest rules
2018-03-30
https://www.epicgames.com/fortnite/en-US/blog/boogiedown-contest-rules
```

