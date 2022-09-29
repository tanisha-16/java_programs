/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_and_Space_Complexity;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class RotateArray {
    public static void rotate(int[] arr, int d) {
    	
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - 1 - d);
        reverse(arr, arr.length - d, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int[] arr={2,4,6,78,8,9,0,1};
        int d=4;
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
