/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StringPalindrome {

    public static String Reverse1(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = Reverse1(str);
        if (str.equals(str1)) {
            System.out.println("Palimdrome string");
        } else {
            System.out.println("Not a palimdrome");
        }
    }
}
