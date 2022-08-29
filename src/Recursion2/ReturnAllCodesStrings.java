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
public class ReturnAllCodesStrings {

    public static String[] getcode(String input) {
        if (input.length() == 0) {
            String[] res = {""};
            return res;
        }
        int oned = input.charAt(0) - '0';
        String[] smallans1 = getcode(input.substring(1));
        String[] smallans2 = new String[0];
        int twod = 0;
        if (input.length() >= 2) {
            twod = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (twod >= 10 && twod <= 26) {
                smallans2 = getcode(input.substring(2));
            }
        }
        String[] res = new String[smallans1.length + smallans2.length];
        int k = 0;
        char c = helper(oned);
        for (int i = 0; i < smallans1.length; i++) {
            res[k] = c + smallans1[i];
            k++;
        }
        c = helper(twod);
        for (int i = 0; i < smallans2.length; i++) {
            res[k] = c + smallans2[i];
            k++;
        }
        return res;
    }

    public static char helper(int n) {
        return (char) ('a' + n - 1);
    }

    public static void main(String[] args) {
        String[] op = getcode("1023");
        for (String s : op) {
            System.out.println(s);
        }
    }
}
