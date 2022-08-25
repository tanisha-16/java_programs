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
public class Multiplication {

    public static int multiplyTwoIntegers(int m, int n) {
        // Write your code here
        if (n == 0) {
            return 0;
        }
        return m + multiplyTwoIntegers(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(4, 0));
    }
}
