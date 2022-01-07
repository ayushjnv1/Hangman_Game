/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

/**
 *
 * @author shree
 */
public class Utility {

    public boolean checkCharPresentInWord(String word, char r) {
        return word.contains(r + "");
    }

    //char insert in String
    public String charInsert(String word, char a, String still) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char p = word.charAt(i);
            if (p == a) {
                result += a;
            } else {
                result += still.charAt(i);
            }
        }
        return result;
    }
    
   // this function check you win or not 
    public boolean winGame(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '*') {
                return false;
            }
        }
        return true;
    }

}
