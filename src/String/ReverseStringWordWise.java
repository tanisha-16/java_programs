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
public class ReverseStringWordWise {

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String reverseWordWise(String input) {
        // Write your code here
        int start = 0;
        input = reverse(input);
        String res = "";
        for (int end = 0; end < input.length(); end++) {
            if (input.charAt(end) == ' ') {

                res += reverse(input.substring(start, end)) + " ";
                start = end + 1;
            }
        }
        res += reverse(input.substring(start, input.length()));
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(reverseWordWise("Welcome To the net beans"));
        System.out.println(reverseWordWise("Welcome to the net beans"));
    }
}
