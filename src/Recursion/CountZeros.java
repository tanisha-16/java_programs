/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CountZeros {

    public static int countZerosRec(int input) {
        if (input == 0) {
            return 1;
        }
        if (input < 10) {
            return 0;
        } else if (input % 10 == 0) {
            return 1 + countZerosRec(input / 10);
        }
        return countZerosRec(input / 10);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(countZerosRec(a));
    }
}
