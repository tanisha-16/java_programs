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
public class ReturnSubsetOfAnArray {

    public static int[][] subsets(int input[], int start) {
        if (input.length == start) {
            int[][] res = new int[1][0];
            return res;
        }
        int[][] smallans = subsets(input, start + 1);
        int[][] ans = new int[smallans.length * 2][];
        int k = 0;
        for (int i = 0; i < smallans.length; i++) {
            ans[k] = new int[smallans[i].length];
            for (int j = 0; j < smallans[i].length; j++) {
                ans[k][j] = smallans[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallans.length; i++) {
            ans[k] = new int[smallans[i].length + 1];
            ans[k][0] = input[start];
            for (int j = 1; j < smallans[i].length + 1; j++) {
                ans[k][j] = smallans[i][j - 1];
            }
            k++;
        }
        return ans;
    }

    public static int[][] subsets(int input[]) {

        return subsets(input, 0);

    }

    public static void main(String[] args) {
        int[] arr = {15, 20, 12};
        int[][] res = subsets(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
