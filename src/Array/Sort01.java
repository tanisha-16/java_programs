/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Lenovo
 */
public class Sort01 {

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = 0;
            if (arr[start] == 1) {
                if (arr[end] != 1) {
                    temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
                end--;
            } else {
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1};
        sortZeroesAndOne(arr);
    }
}
