/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

/**
 *
 * @author Lenovo
 */
public class Print2dArray {

    public static void print2DArray(int input[][]) {
        // Write your code here
        int k = 0;
        while (k < input.length) {
            for (int i = 0; i < input.length - k; i++) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[k][j] + " ");
                }
                System.out.println();
            }
            k++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(arr);
    }
}
