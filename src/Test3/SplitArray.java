/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

/**
 *
 * @author Lenovo
 */
public class SplitArray {

    public static boolean splitArray(int input[]) {
        return splitArray(input, 0, 0, 0);
    }

    public static boolean splitArray(int input[], int start, int lsum, int rsum) {
        if (input.length == start) {
            return lsum == rsum;
        }
        if (input[start] % 3 == 0) {
            lsum += input[start];
        } else if (input[start] % 5 == 0) {
            rsum += input[start];
        } else {
            return splitArray(input, start + 1, lsum + input[start], rsum) || splitArray(input, start + 1, lsum, rsum + input[start]);
        }
        return splitArray(input, start + 1, lsum, rsum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3};
        int[] arr1 = {1, 2};
        System.out.println(splitArray(arr));
        System.out.println(splitArray(arr1));
    }
}
