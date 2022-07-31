/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArray;

/**
 *
 * @author Lenovo
 */
public class LargestRoworColumn {

    public static void findLargest(int mat[][]) {
        //Your code goes here
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int indexi = 0;
        int indexj = 0;
        int index;
        String pos;
        if (mat.length == 0) {
            System.out.println("row " + 0 + " " + max);
        } else {
            for (int i = 0; i < mat.length; i++) {
                int sum = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    sum += mat[i][j];
                }
                if (sum > max1) {
                    max1 = sum;
                    indexi = i;
                }
            }
            for (int j = 0; j < mat[0].length; j++) {
                int sum = 0;
                for (int i = 0; i < mat.length; i++) {
                    sum += mat[i][j];
                }
                if (sum > max2) {
                    max2 = sum;
                    indexj = j;
                }
            }
            if (max1 >= max2) {
                max = max1;
                index = indexi;
                pos = "row";
            } else {
                max = max2;
                index = indexj;
                pos = "column";
            }
            System.out.print(pos + " " + index + " " + max);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 5, 8}, {7, 10, 4}, {10, 3, 6}};
        findLargest(arr);
    }
}
