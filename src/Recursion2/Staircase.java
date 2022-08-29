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
public class Staircase {

    public static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(staircase(5));
    }
}
