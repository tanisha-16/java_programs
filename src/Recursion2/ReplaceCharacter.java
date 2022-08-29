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
public class ReplaceCharacter {

    public static String replaceCharacter(String input, char c1, char c2) {

        if (input.length() < 1) {
            return input;
        }
        if (input.charAt(0) == c1) {
            return c2 + replaceCharacter(input.substring(1), c1, c2);
        } else {
            return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
        }
    }
    public static void main(String[] args) {
        System.out.println(replaceCharacter("aabaavnm", 'a', 'x'));
    }
}
