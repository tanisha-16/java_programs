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
public class StringToInteger {

    public static int convertStringToInt(String input) {
        if (input.length() == 1) {
            return input.charAt(0) - '0';
        }
        int smallstr = convertStringToInt(input.substring(1));
        int x = input.charAt(0) - '0';
        x = x * (int) Math.pow(10, input.length() - 1) + smallstr;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt("0000123540"));
    }
}
