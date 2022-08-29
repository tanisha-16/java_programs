/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionAssignment;

/**
 *
 * @author Lenovo
 */
public class PairStar {

    public static String addStars(String s) {
        // Write your code here
        if (s.length() == 1 || s.length() == 0) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + addStars(s.substring(1));
        } else {
            return s.charAt(0) + addStars(s.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(addStars("aabcccccdeabbb"));
    }
}
