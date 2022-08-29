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
public class Quicksort {

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int c = 0;
        for (int i = start + 1; i <= end; i++) {
            if (input[i] <= pivot) {
                c++;
            }
        }
        int temp;
        int pivotpos = start + c;
        temp = input[start];
        input[start] = input[pivotpos];
        input[pivotpos] = temp;

        int i = start, j = end;
        while (i < pivotpos && j > pivotpos) {
            if (input[i] <= pivot) {
                i++;
            } else if (input[j] > pivot) {
                j--;
            } else {
                int temp1 = input[i];
                input[i] = input[j];
                input[j] = temp1;
                i++;
                j--;
            }
        }
        return pivotpos;

    }

    public static void quickSort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotpos = partition(input, start, end);
        quickSort(input, start, pivotpos - 1);
        quickSort(input, pivotpos + 1, end);

    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {101, 12, 56, 23, 99, 120, 1, 3, 2, 33, 45, 78};
        Quicksort.quickSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
