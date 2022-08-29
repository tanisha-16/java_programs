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
public class RemoveDuplicates {

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aaaabcccdeef"));
    }
}
