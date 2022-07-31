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
public class PrintWave {

    public static void wavePrint(int mat[][]) {
        //Your code goes here
        if (mat.length == 0); else {
            for (int j = 0; j < mat[0].length; j++) {
                if (j % 2 == 0) {
                    for (int i = 0; i < mat.length; i++) {
                        System.out.print(mat[i][j] + " ");
                    }
                } else {
                    for (int i = mat.length - 1; i >= 0; i--) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {3, 8, 9}, {12, 34, 67}};
        wavePrint(arr);
    }
}
