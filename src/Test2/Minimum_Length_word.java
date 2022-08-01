/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

/**
 *
 * @author Lenovo
 */
public class Minimum_Length_word {

    public static String minLengthWord(String input) {
        input += " ";
        int i = 0, start = 0, end = input.length();
        int min = input.length();
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == ' ') {
                String substr = input.substring(i, j);
                int len = substr.length();
                if (min > len) {
                    min = len;
                    start = i;
                    end = j;
                }
                i = j + 1;
            }
        }
        return input.substring(start, end);
    }

    public static void main(String[] args) {
        String str = "Full Metal Alchemist";
        System.out.println(minLengthWord(str));
    }
}
