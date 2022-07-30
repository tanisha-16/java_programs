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
public class HighestOcuuringcharacter {

    public static char highestOccuringChar(String str) {
        //Your code goes here
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)] += 1;
        }
        char reschar = str.charAt(0);
        int max = freq[str.charAt(0)];
        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                reschar = str.charAt(i);
                max = freq[str.charAt(i)];
            }
        }
        return reschar;
    }

    public static void main(String[] args) {
        String str = "bcdddfgfffffghh";
        System.out.println(highestOccuringChar(str));
    }
}
