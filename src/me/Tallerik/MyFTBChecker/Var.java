package me.Tallerik.MyFTBChecker;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * The type Var.
 */
public class Var {
    /**
     * The Players.
     */
    static List<String> players;
    /**
     * The Url.
     */
    static String url;

    /**
     * Instantiates a new Var.
     */
    public Var() {

    }

    /**
     * Refresh player list
     */
    public static void refresh() {
        try {
            String content = getPlayers.getSiteContent();
            players = Arrays.asList(content.split(","));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Relook input in players.
     *
     * @param ask input from text field
     * @return the equaling players
     */
    public static String relook(String ask) {
        List<String> asks = Arrays.asList(ask.split(" "));
        String onlinePlayers = "";
        for(String a : asks) {
            for (String player : players) {
                if(a.equalsIgnoreCase(player)) {
                    onlinePlayers = onlinePlayers + a + ", ";
                    break;
                }
            }
        }
        // System.out.println(players);
        return onlinePlayers;
    }
}
