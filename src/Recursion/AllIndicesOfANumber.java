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
public class AllIndicesOfANumber {

    public static int[] allIndexes(int input[], int x, int startIndex) {
        if (startIndex > input.length - 1) {
            return new int[0];
        }
        int[] smallarr = allIndexes(input, x, startIndex + 1);
        if (input[startIndex] == x) {
            int[] resarr = new int[smallarr.length + 1];
            resarr[0] = startIndex;
            for (int i = 0; i < smallarr.length; i++) {
                resarr[i + 1] = smallarr[i];
            }
            return resarr;
        } else {
            return smallarr;
        }

    }

    public static int[] allIndexes(int input[], int x) {

        return allIndexes(input, x, 0);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 5, 6, 3, 7, 3, 8, 2};
        int[] res = allIndexes(arr, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
