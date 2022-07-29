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
public class PrintSubstring {

    public static void printSubstrings(String str) {
        //Your code goes here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void printSubstrings2(String str) {
        //Your code goes here
        for (int i = 1; i <= str.length(); i++) {
            for (int start = 0; start <= str.length()-i; start++) {
                int end=start+i-1;
                System.out.println(str.substring(start, end+1));
            }
        }
    }

    public static void main(String[] args) {
        printSubstrings("abc");
        printSubstrings2("abc");
    }
}
