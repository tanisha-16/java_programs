/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Lenovo
 */
public class SumOfDigit {

    public static int sumOfDigits(int input) {
        if (input < 10) {
            return input;
        }
        return input % 10 + sumOfDigits(input / 10);
    }
    public static void main(String[] args) {
        
        System.out.println(sumOfDigits(12345023));
    }
}
