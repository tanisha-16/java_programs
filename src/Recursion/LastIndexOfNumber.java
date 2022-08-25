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
public class LastIndexOfNumber {

    public static int lastIndex(int input[], int x, int lIndex) {
        if (lIndex < 0) {
            return -1;
        }
        if (input[lIndex] == x) {
            return lIndex;
        }
        return lastIndex(input, x, lIndex - 1);
    }

    public static int lastIndex(int input[], int x) {
       
        return lastIndex(input, x, input.length - 1);
    }

    public static void main(String[] args) {
        int[] input = {2, 5, 8, 10, 10, 45};
        System.out.println(lastIndex(input, 10));
    }
}
