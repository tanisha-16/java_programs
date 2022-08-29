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
public class Replacepi {

    public static String replace(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return input;
        }
        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            return "3.14" + replace(input.substring(2));
        } else {
            return input.charAt(0) + replace(input.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(replace("pipppiiipi"));
    }
}
