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
public class Boundaryanddiagonalsum {

    public static void totalSum(int[][] mat) {
        //Your code goes here
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 || j == 0 || i == j || i == mat.length - 1 || j == mat.length - 1 || (i + j) == mat.length - 1) {
                    sum += mat[i][j];
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr = {{6, 9, 8, 5, 9}, {2, 4, 1, 8, 3}, {9, 3, 8, 7, 8}, {6, 8, 9, 4, 1}, {1, 7, 6, 1, 5}};
        totalSum(arr);
    }
}
