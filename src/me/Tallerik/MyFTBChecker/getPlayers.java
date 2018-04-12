package me.Tallerik.MyFTBChecker;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * The type Get players.
 */
public class getPlayers {


    /**
     * Gets a player list.
     *
     * @return the site content
     * @throws IOException the io exception
     */
    public static String getSiteContent() throws IOException {
        Socket socket = new Socket("tallerikyt.ddns.net", 80);
        InputStream in = socket.getInputStream();
        Scanner scan = new Scanner(in);

        OutputStream out = socket.getOutputStream();
        PrintStream psout = new PrintStream(out);

        psout.println("GET /myftb/getPlayers.php HTTP/1.1");
        psout.println("Host: tallerikyt.ddns.net");
        psout.println("User-Agent: Mozilla/5.0");
        psout.println();

        int i = 0;
        String output = "";
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            if(i == 7) {
                output = s;
            }
            i++;
        }
        return output;
    }

}

