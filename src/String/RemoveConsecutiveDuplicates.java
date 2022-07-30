/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Lenovo
 */
public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        String res = "";
        char c = str.charAt(0);
        res += c;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c); else {
                res += str.charAt(i);
            }
            c = str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aaaaaaabcbbbdb";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
