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
public class PrintKeypadCombinations {

    public static String helper(int n) {
        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return str[n];
    }

    public static void printKeypad(int input, String str) {
        if (input == 0) {
            System.out.println(str);
            return;
        }
        String h = helper(input % 10);
        for (int i = 0; i < h.length(); i++) {
            printKeypad(input / 10, h.charAt(i) + str);
        }
    }

    public static void printKeypad(int input) {
        printKeypad(input, "");

    }

    public static void main(String[] args) {
        printKeypad(23);
    }
}
