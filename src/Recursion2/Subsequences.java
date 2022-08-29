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
public class Subsequences {

    public static String[] findSubsequence(String str) {
        if (str.length() == 0) {
            String[] s = {""};
            return s;
        }
        String[] smallAns = findSubsequence(str.substring(1));
        String[] s = new String[smallAns.length * 2];
        for (int i = 0; i < smallAns.length; i++) {
            s[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            s[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abc";
        String str[] = findSubsequence(s);
        for (String j : str) {
            System.out.println(j);
        }
    }
}
