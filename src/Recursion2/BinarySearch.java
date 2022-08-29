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
public class BinarySearch {

    public static int binarySearch(int input[], int element, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (input[mid] == element) {
            return mid;
        } else if (input[mid] < element) {
            return binarySearch(input, element, mid + 1, end);
        } else {
            return binarySearch(input, element, start, mid - 1);
        }
    }

    public static int binarySearch(int input[], int element) {

        return binarySearch(input, element, 0, input.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 11, 45, 67, 89, 91, 100};
        System.out.println(binarySearch(arr, 91));
    }
}
