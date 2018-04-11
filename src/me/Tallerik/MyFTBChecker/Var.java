package me.Tallerik.MyFTBChecker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Var {
    static List<String> players;
    static String url;

    public Var() {
        players = new ArrayList<String>();



    }

    public static void refresh() {
        try {
            getPlayers.getSiteContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
