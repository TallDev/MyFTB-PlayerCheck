package me.Tallerik.MyFTBChecker;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Var {
    static List<String> players;
    static String url;

    public Var() {

    }

    public static void refresh() {
        try {
            String content = getPlayers.getSiteContent();
            players = Arrays.asList(content.split(","));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String relook(String ask) {
        List<String> asks = Arrays.asList(ask.split(" "));
        String onlinePlayers = "";
        for(String a : asks) {
            for (String player : players) {
                if(a.equalsIgnoreCase(player)) {
                    onlinePlayers = onlinePlayers + a + ", ";
                }
            }
        }
        System.out.println(players);
        return onlinePlayers;
    }
}
