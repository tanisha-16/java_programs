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
public class Rowwisesum {

    public static void rowWiseSum(int[][] mat) {
        //Your code goes here
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
    }
    public static void main(String[] args) {
        int arr[][]={{15,8,67},{-20,-5,15},{10,34,-6}};
        rowWiseSum(arr);
    }
}
