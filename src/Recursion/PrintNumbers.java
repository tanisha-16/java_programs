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
public class PrintNumbers {

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(6);
    }
}
