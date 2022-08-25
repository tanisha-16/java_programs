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
public class SumOfArray {

    public static int sum(int input[]) {
        if (input.length == 0) {
            return 0;
        }

        int[] smallarr = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallarr[i - 1] = input[i];
        }
        return input[0] + sum(smallarr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 45};
        System.out.println(sum(arr));
    }

}
