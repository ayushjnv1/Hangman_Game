/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.net.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author shree
 */
public class Wordfetch {

    static public String word() {
        try {
            // word fetching from api
            URL url = new URL("https://random-word-api.herokuapp.com/word?number=1");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            String word = content.toString();
            System.out.println(word);
            return word.substring(2, word.length() - 2);
        } catch (Exception e) {
            System.out.println(e);

        }
        return "";
    }
}
