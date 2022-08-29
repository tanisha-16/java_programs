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
public class ReturnKeypadCode {

    public static int count(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static String helper(int n) {
        String help[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return help[n];
    }

    public static String[] keypad(int n) {
        if (n == 0) {
            String[] s = {""};
            return s;
        }
        String[] smallans = keypad(n / 10);
        String[] s = new String[(int) Math.pow(4, count(n))];

        String str = helper(n % 10);

        int k = 0;
//        for (int j = 0; j < str.length(); j++) {
//            for (int i = 0; i < smallans.length; i++) {
//                s[k] = smallans[i] + str.charAt(j);
//                k++;
//            }
//        }

        for (int i = 0; i < smallans.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                s[k] = smallans[i] + str.charAt(j);
                k++;
            }
        }
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                count++;
            }
        }
        String[] news = new String[s.length - count];
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                news[i] = s[i];
            }

        }
        return news;

    }

    public static void main(String[] args) {
        //System.out.println((int)Math.pow(4.0, 3));
        String[] str = keypad(234);
        for (String s : str) {
            System.out.println(s);
        }

    }
}
