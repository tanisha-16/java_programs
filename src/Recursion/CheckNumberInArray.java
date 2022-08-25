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
public class CheckNumberInArray {

    public static boolean checkNumber(int input[], int x) {
        if (input.length == 0) {
            return false;
        }
        if (input[0] == x) {
            return true;
        }

        int[] smallarr = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallarr[i - 1] = input[i];
        }
        return checkNumber(smallarr, x);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 10, 13};
        System.out.println(checkNumber(arr, 6));
    }
}
