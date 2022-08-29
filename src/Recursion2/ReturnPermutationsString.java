/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Lenovo
 */
public class ReturnPermutationsString {

    public static String[] permutationOfString(String input) {
        if (input.length() == 0) {
            String[] res = {""};
            return res;
        }
        String[] smallans = permutationOfString(input.substring(1));
        String[] res = new String[input.length() * smallans.length];
        int k = 0;
        for (int i = 0; i < smallans.length; i++) {
            for (int j = 0; j <= smallans[i].length(); j++) {
                res[k++] = smallans[i].substring(0, j) + input.charAt(0) + smallans[i].substring(j);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] op = permutationOfString("abc");
        for (String s : op) {
            System.out.println(s);
        }
    }
}
