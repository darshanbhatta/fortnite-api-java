public class StatsXB1 {

    //xb1 raw data
    private double br_score_xb1_m0_p2; //solo score
    private double br_score_xb1_m0_p10; //duos score
    private double br_score_xb1_m0_p9; //squad score

    private double br_matchesplayed_xb1_m0_p2; //solo matches
    private double br_matchesplayed_xb1_m0_p10; //duos matches
    private double br_matchesplayed_xb1_m0_p9; //squad matches

    private long br_lastmodified_xb1_m0_p2; //solo last update time
    private long br_lastmodified_xb1_m0_p10; //duos last update time
    private long br_lastmodified_xb1_m0_p9; //squad last update time

    private double br_placetop1_xb1_m0_p2; //solo wins
    private double br_placetop1_xb1_m0_p10; //duos wins
    private double br_placetop1_xb1_m0_p9; //squad wins

    private double br_minutesplayed_xb1_m0_p2; //solo time played (currently not tracked)
    private double br_minutesplayed_xb1_m0_p10; //duos time played (currently not tracked)
    private double br_minutesplayed_xb1_m0_p9; //squad time played (currently not tracked)

    private double br_kills_xb1_m0_p2; //solo kills
    private double br_kills_xb1_m0_p10; //duos kills
    private double br_kills_xb1_m0_p9; //squad kills

    private double br_placetop10_xb1_m0_p2; //solo top 10
    private double br_placetop25_xb1_m0_p2; //solo top 25

    private double br_placetop5_xb1_m0_p10; //duos top 5
    private double br_placetop12_xb1_m0_p10; //duos top 12

    private double br_placetop3_xb1_m0_p9; //duos top 3
    private double br_placetop6_xb1_m0_p9; //squad top 6



    //xb1 calc
    private double kd_xb1_p2; //solo kill/death
    private double kd_xb1_p10; //duos kill/death
    private double kd_xb1_p9; //squad kill/death
    private double kd_xb1_all; //combined kill/death

    private double km_xb1_p2; //solo kills/match
    private double km_xb1_p10; //duos kills/match
    private double km_xb1_p9; //squad kills/match
    private double km_xb1_all; //combined kills/match

    private double wp_xb1_p2; //solo win percentage
    private double wp_xb1_p10; //duos win percentage
    private double wp_xb1_p9; //squad win percentage
    private double wp_xb1_all; //squad win percentage


    public StatsXB1(double br_score_xb1_m0_p2, double br_score_xb1_m0_p10, double br_score_xb1_m0_p9, double br_matchesplayed_xb1_m0_p2, double br_matchesplayed_xb1_m0_p10, double br_matchesplayed_xb1_m0_p9, long br_lastmodified_xb1_m0_p2, long br_lastmodified_xb1_m0_p10, long br_lastmodified_xb1_m0_p9, double br_placetop1_xb1_m0_p2, double br_placetop1_xb1_m0_p10, double br_placetop1_xb1_m0_p9, double br_minutesplayed_xb1_m0_p2, double br_minutesplayed_xb1_m0_p10, double br_minutesplayed_xb1_m0_p9, double br_kills_xb1_m0_p2, double br_kills_xb1_m0_p10, double br_kills_xb1_m0_p9, double br_placetop3_xb1_m0_p9, double br_placetop6_xb1_m0_p9, double br_placetop12_xb1_m0_p10, double br_placetop5_xb1_m0_p10, double br_placetop25_xb1_m0_p2, double br_placetop10_xb1_m0_p2) {
        this.br_score_xb1_m0_p2 = br_score_xb1_m0_p2;
        this.br_score_xb1_m0_p10 = br_score_xb1_m0_p10;
        this.br_score_xb1_m0_p9 = br_score_xb1_m0_p9;
        this.br_matchesplayed_xb1_m0_p2 = br_matchesplayed_xb1_m0_p2;
        this.br_matchesplayed_xb1_m0_p10 = br_matchesplayed_xb1_m0_p10;
        this.br_matchesplayed_xb1_m0_p9 = br_matchesplayed_xb1_m0_p9;
        this.br_lastmodified_xb1_m0_p2 = br_lastmodified_xb1_m0_p2;
        this.br_lastmodified_xb1_m0_p10 = br_lastmodified_xb1_m0_p10;
        this.br_lastmodified_xb1_m0_p9 = br_lastmodified_xb1_m0_p9;
        this.br_placetop1_xb1_m0_p2 = br_placetop1_xb1_m0_p2;
        this.br_placetop1_xb1_m0_p10 = br_placetop1_xb1_m0_p10;
        this.br_placetop1_xb1_m0_p9 = br_placetop1_xb1_m0_p9;
        this.br_minutesplayed_xb1_m0_p2 = br_minutesplayed_xb1_m0_p2;
        this.br_minutesplayed_xb1_m0_p10 = br_minutesplayed_xb1_m0_p10;
        this.br_minutesplayed_xb1_m0_p9 = br_minutesplayed_xb1_m0_p9;
        this.br_kills_xb1_m0_p2 = br_kills_xb1_m0_p2;
        this.br_kills_xb1_m0_p10 = br_kills_xb1_m0_p10;
        this.br_kills_xb1_m0_p9 = br_kills_xb1_m0_p9;
        this.br_placetop3_xb1_m0_p9 = br_placetop3_xb1_m0_p9;
        this.br_placetop6_xb1_m0_p9 = br_placetop6_xb1_m0_p9;
        this.br_placetop12_xb1_m0_p10 = br_placetop12_xb1_m0_p10;
        this.br_placetop5_xb1_m0_p10 = br_placetop5_xb1_m0_p10;
        this.br_placetop25_xb1_m0_p2 = br_placetop25_xb1_m0_p2;
        this.br_placetop10_xb1_m0_p2 = br_placetop10_xb1_m0_p2;

        kd_xb1_p2 = br_kills_xb1_m0_p2/(br_matchesplayed_xb1_m0_p2-br_placetop1_xb1_m0_p2);
        kd_xb1_p10 = br_kills_xb1_m0_p10/(br_matchesplayed_xb1_m0_p10-br_placetop1_xb1_m0_p10);
        kd_xb1_p9 = br_kills_xb1_m0_p9/(br_matchesplayed_xb1_m0_p9-br_placetop1_xb1_m0_p9);
        kd_xb1_all = (br_kills_xb1_m0_p2+br_kills_xb1_m0_p10+br_kills_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2-br_placetop1_xb1_m0_p2+br_matchesplayed_xb1_m0_p10-br_placetop1_xb1_m0_p10+br_matchesplayed_xb1_m0_p9-br_placetop1_xb1_m0_p9);

        km_xb1_p2 = br_kills_xb1_m0_p2/(br_matchesplayed_xb1_m0_p2);
        km_xb1_p10 = br_kills_xb1_m0_p10/(br_matchesplayed_xb1_m0_p10);
        km_xb1_p9 = br_kills_xb1_m0_p9/(br_matchesplayed_xb1_m0_p9);
        km_xb1_all = (br_kills_xb1_m0_p2+br_kills_xb1_m0_p10+br_kills_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2+br_matchesplayed_xb1_m0_p10+br_matchesplayed_xb1_m0_p9);

        wp_xb1_p2 = br_placetop1_xb1_m0_p2/br_matchesplayed_xb1_m0_p2;
        wp_xb1_p10 = br_placetop1_xb1_m0_p10/br_matchesplayed_xb1_m0_p10;
        wp_xb1_p9 = br_placetop1_xb1_m0_p9/br_matchesplayed_xb1_m0_p9;
        wp_xb1_all = (br_placetop1_xb1_m0_p2+br_placetop1_xb1_m0_p10+br_placetop1_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2+br_matchesplayed_xb1_m0_p10+br_matchesplayed_xb1_m0_p9);

    }

    public void calc(){

        kd_xb1_p2 = br_kills_xb1_m0_p2/(br_matchesplayed_xb1_m0_p2-br_placetop1_xb1_m0_p2);
        kd_xb1_p10 = br_kills_xb1_m0_p10/(br_matchesplayed_xb1_m0_p10-br_placetop1_xb1_m0_p10);
        kd_xb1_p9 = br_kills_xb1_m0_p9/(br_matchesplayed_xb1_m0_p9-br_placetop1_xb1_m0_p9);
        kd_xb1_all = (br_kills_xb1_m0_p2+br_kills_xb1_m0_p10+br_kills_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2-br_placetop1_xb1_m0_p2+br_matchesplayed_xb1_m0_p10-br_placetop1_xb1_m0_p10+br_matchesplayed_xb1_m0_p9-br_placetop1_xb1_m0_p9);

        km_xb1_p2 = br_kills_xb1_m0_p2/(br_matchesplayed_xb1_m0_p2);
        km_xb1_p10 = br_kills_xb1_m0_p10/(br_matchesplayed_xb1_m0_p10);
        km_xb1_p9 = br_kills_xb1_m0_p9/(br_matchesplayed_xb1_m0_p9);
        km_xb1_all = (br_kills_xb1_m0_p2+br_kills_xb1_m0_p10+br_kills_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2+br_matchesplayed_xb1_m0_p10+br_matchesplayed_xb1_m0_p9);

        wp_xb1_p2 = br_placetop1_xb1_m0_p2/br_matchesplayed_xb1_m0_p2;
        wp_xb1_p10 = br_placetop1_xb1_m0_p10/br_matchesplayed_xb1_m0_p10;
        wp_xb1_p9 = br_placetop1_xb1_m0_p9/br_matchesplayed_xb1_m0_p9;
        wp_xb1_all = (br_placetop1_xb1_m0_p2+br_placetop1_xb1_m0_p10+br_placetop1_xb1_m0_p9)/(br_matchesplayed_xb1_m0_p2+br_matchesplayed_xb1_m0_p10+br_matchesplayed_xb1_m0_p9);


    }


    public double getBr_score_xb1_m0_p2() {
        return br_score_xb1_m0_p2;
    }

    public double getBr_score_xb1_m0_p10() {
        return br_score_xb1_m0_p10;
    }

    public double getBr_score_xb1_m0_p9() {
        return br_score_xb1_m0_p9;
    }

    public double getBr_matchesplayed_xb1_m0_p2() {
        return br_matchesplayed_xb1_m0_p2;
    }

    public double getBr_matchesplayed_xb1_m0_p10() {
        return br_matchesplayed_xb1_m0_p10;
    }

    public double getBr_matchesplayed_xb1_m0_p9() {
        return br_matchesplayed_xb1_m0_p9;
    }

    public long getBr_lastmodified_xb1_m0_p2() {
        return br_lastmodified_xb1_m0_p2;
    }

    public long getBr_lastmodified_xb1_m0_p10() {
        return br_lastmodified_xb1_m0_p10;
    }

    public long getBr_lastmodified_xb1_m0_p9() {
        return br_lastmodified_xb1_m0_p9;
    }

    public double getBr_placetop1_xb1_m0_p2() {
        return br_placetop1_xb1_m0_p2;
    }

    public double getBr_placetop1_xb1_m0_p10() {
        return br_placetop1_xb1_m0_p10;
    }

    public double getBr_placetop1_xb1_m0_p9() {
        return br_placetop1_xb1_m0_p9;
    }

    public double getBr_minutesplayed_xb1_m0_p2() {
        return br_minutesplayed_xb1_m0_p2;
    }

    public double getBr_minutesplayed_xb1_m0_p10() {
        return br_minutesplayed_xb1_m0_p10;
    }

    public double getBr_minutesplayed_xb1_m0_p9() {
        return br_minutesplayed_xb1_m0_p9;
    }

    public double getBr_kills_xb1_m0_p2() {
        return br_kills_xb1_m0_p2;
    }

    public double getBr_kills_xb1_m0_p10() {
        return br_kills_xb1_m0_p10;
    }

    public double getBr_kills_xb1_m0_p9() {
        return br_kills_xb1_m0_p9;
    }

    public double getBr_placetop3_xb1_m0_p9() {
        return br_placetop3_xb1_m0_p9;
    }

    public double getBr_placetop6_xb1_m0_p9() {
        return br_placetop6_xb1_m0_p9;
    }

    public double getBr_placetop12_xb1_m0_p10() {
        return br_placetop12_xb1_m0_p10;
    }

    public double getBr_placetop5_xb1_m0_p10() {
        return br_placetop5_xb1_m0_p10;
    }

    public double getBr_placetop25_xb1_m0_p2() {
        return br_placetop25_xb1_m0_p2;
    }

    public double getBr_placetop10_xb1_m0_p2() {
        return br_placetop10_xb1_m0_p2;
    }


    public double getKd_xb1_p2() {
        return kd_xb1_p2;
    }

    public double getKd_xb1_p10() {
        return kd_xb1_p10;
    }

    public double getKd_xb1_p9() {
        return kd_xb1_p9;
    }

    public double getKd_xb1_all() {
        return kd_xb1_all;
    }

    public double getKm_xb1_p2() {
        return km_xb1_p2;
    }

    public double getKm_xb1_p10() {
        return km_xb1_p10;
    }

    public double getKm_xb1_p9() {
        return km_xb1_p9;
    }

    public double getKm_xb1_all() {
        return km_xb1_all;
    }

    public double getWp_xb1_p2() {
        return wp_xb1_p2;
    }

    public double getWp_xb1_p10() {
        return wp_xb1_p10;
    }

    public double getWp_xb1_p9() {
        return wp_xb1_p9;
    }

    public double getWp_xb1_all() {
        return wp_xb1_all;
    }

    public String lifeTime(){
        String print = "\nLIFETIME STATS\n" + "Wins: " + (int)(br_placetop1_xb1_m0_p2+br_placetop1_xb1_m0_p9+br_placetop1_xb1_m0_p10) + "\n" +
                "Top 10/5/3: " + (int)(br_placetop10_xb1_m0_p2+br_placetop5_xb1_m0_p10+br_placetop3_xb1_m0_p9) + "\n" +
                "Top 25/12/6: " + (int)(br_placetop25_xb1_m0_p2+br_placetop12_xb1_m0_p10+br_placetop6_xb1_m0_p9) + "\n" +
                "Kills: " +(int)(br_kills_xb1_m0_p2+br_kills_xb1_m0_p9+br_kills_xb1_m0_p10)+ "\n" +
                "K/D: " +Math.round(kd_xb1_all * 100.0) / 100.0+ "\n" +
                "K/match: " +Math.round(km_xb1_all * 100.0) / 100.0+ "\n" +
                "Matches: " +(int)(br_matchesplayed_xb1_m0_p2+br_matchesplayed_xb1_m0_p9+br_matchesplayed_xb1_m0_p10)+ "\n" +
                "Win %: " +Math.round(wp_xb1_all*100 * 100.0) / 100.0+ "\n" ;

        return  print;

    }

    public String soloStat(){
        String print = "\nSOLO STATS\n" + "Wins: " + (int)(br_placetop1_xb1_m0_p2) + "\n" +
                "Top 10: " + (int)(br_placetop10_xb1_m0_p2) + "\n" +
                "Top 25: " + (int)(br_placetop25_xb1_m0_p2) + "\n" +
                "Kills: " +(int)(br_kills_xb1_m0_p2)+ "\n" +
                "K/D: " +Math.round(kd_xb1_p2 * 100.0) / 100.0+ "\n" +
                "K/match: " +Math.round(km_xb1_p2 * 100.0) / 100.0+ "\n" +
                "Matches: " +(int)(br_matchesplayed_xb1_m0_p2)+ "\n" +
                "Win %: " +Math.round(wp_xb1_p2*100 * 100.0) / 100.0+ "\n" ;

        return  print;

    }

    public String duoStat(){
        String print = "\nDUO STATS\n" + "Wins: " + (int)(br_placetop1_xb1_m0_p10) + "\n" +
                "Top 5: " + (int)(br_placetop5_xb1_m0_p10) + "\n" +
                "Top 12: " + (int)(br_placetop12_xb1_m0_p10) + "\n" +
                "Kills: " +(int)(br_kills_xb1_m0_p10)+ "\n" +
                "K/D: " +Math.round(kd_xb1_p10 * 100.0) / 100.0+ "\n" +
                "K/match: " +Math.round(km_xb1_p10 * 100.0) / 100.0+ "\n" +
                "Matches: " +(int)(br_matchesplayed_xb1_m0_p10)+ "\n" +
                "Win %: " +Math.round(wp_xb1_p10*100 * 100.0) / 100.0+ "\n" ;

        return  print;

    }

    public String squadStat(){
        String print = "\nSQUAD STATS\n" + "Wins: " + (int)(br_placetop1_xb1_m0_p9) + "\n" +
                "Top 3: " + (int)(br_placetop3_xb1_m0_p9) + "\n" +
                "Top 6: " + (int)(br_placetop6_xb1_m0_p9) + "\n" +
                "Kills: " +(int)(br_kills_xb1_m0_p9)+ "\n" +
                "K/D: " +Math.round(kd_xb1_p9 * 100.0) / 100.0+ "\n" +
                "K/match: " +Math.round(km_xb1_p9 * 100.0) / 100.0+ "\n" +
                "Matches: " +(int)(br_matchesplayed_xb1_m0_p9)+ "\n" +
                "Win %: " +Math.round(wp_xb1_p9*100 * 100.0) / 100.0+ "\n" ;

        return  print;

    }

    public boolean hasAccount(){

        if(br_score_xb1_m0_p2+br_score_xb1_m0_p10+br_score_xb1_m0_p9==0){
            return false;

        }

        return true;
    }


    @Override
    public String toString() {
        return "Statsxb1:" +
                "\n br_score_xb1_m0_p2=" + br_score_xb1_m0_p2 +
                "\n br_score_xb1_m0_p10=" + br_score_xb1_m0_p10 +
                "\n br_score_xb1_m0_p9=" + br_score_xb1_m0_p9 +
                "\n br_matchesplayed_xb1_m0_p2=" + br_matchesplayed_xb1_m0_p2 +
                "\n br_matchesplayed_xb1_m0_p10=" + br_matchesplayed_xb1_m0_p10 +
                "\n br_matchesplayed_xb1_m0_p9=" + br_matchesplayed_xb1_m0_p9 +
                "\n br_lastmodified_xb1_m0_p2=" + br_lastmodified_xb1_m0_p2 +
                "\n br_lastmodified_xb1_m0_p10=" + br_lastmodified_xb1_m0_p10 +
                "\n br_lastmodified_xb1_m0_p9=" + br_lastmodified_xb1_m0_p9 +
                "\n br_placetop1_xb1_m0_p2=" + br_placetop1_xb1_m0_p2 +
                "\n br_placetop1_xb1_m0_p10=" + br_placetop1_xb1_m0_p10 +
                "\n br_placetop1_xb1_m0_p9=" + br_placetop1_xb1_m0_p9 +
                "\n br_minutesplayed_xb1_m0_p2=" + br_minutesplayed_xb1_m0_p2 +
                "\n br_minutesplayed_xb1_m0_p10=" + br_minutesplayed_xb1_m0_p10 +
                "\n br_minutesplayed_xb1_m0_p9=" + br_minutesplayed_xb1_m0_p9 +
                "\n br_kills_xb1_m0_p2=" + br_kills_xb1_m0_p2 +
                "\n br_kills_xb1_m0_p10=" + br_kills_xb1_m0_p10 +
                "\n br_kills_xb1_m0_p9=" + br_kills_xb1_m0_p9 +
                "\n br_placetop10_xb1_m0_p2=" + br_placetop10_xb1_m0_p2 +
                "\n br_placetop25_xb1_m0_p2=" + br_placetop25_xb1_m0_p2 +
                "\n br_placetop5_xb1_m0_p10=" + br_placetop5_xb1_m0_p10 +
                "\n br_placetop12_xb1_m0_p10=" + br_placetop12_xb1_m0_p10 +
                "\n br_placetop3_xb1_m0_p9=" + br_placetop3_xb1_m0_p9 +
                "\n br_placetop6_xb1_m0_p9=" + br_placetop6_xb1_m0_p9 +
                "\n kd_xb1_p2=" + kd_xb1_p2 +
                "\n kd_xb1_p10=" + kd_xb1_p10 +
                "\n kd_xb1_p9=" + kd_xb1_p9 +
                "\n kd_xb1_all=" + kd_xb1_all +
                "\n km_xb1_p2=" + km_xb1_p2 +
                "\n km_xb1_p10=" + km_xb1_p10 +
                "\n km_xb1_p9=" + km_xb1_p9 +
                "\n km_xb1_all=" + km_xb1_all +
                "\n wp_xb1_p2=" + wp_xb1_p2 +
                "\n wp_xb1_p10=" + wp_xb1_p10 +
                "\n wp_xb1_p9=" + wp_xb1_p9 +
                "\n wp_xb1_all=" + wp_xb1_all;
    }
}
