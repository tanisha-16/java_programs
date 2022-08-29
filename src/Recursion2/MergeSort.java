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
public class MergeSort {

    public static void merge(int[] input, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = input[start + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = input[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }

    public static void mergeSort(int[] input) {
        mergeSort(input, 0, input.length - 1);

    }

    public static void main(String[] args) {
        int[] arr = {89, 78, 101, 99, 56, 2, 5, 6, 90};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
