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
public class ReturnSubsetsSumtoK {

    public static int[][] subsetsSumK(int input[], int k, int start) {
        if (input.length == start) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }
        int[][] smallans1 = subsetsSumK(input, k - input[start], start + 1);
        int[][] smallans2 = subsetsSumK(input, k, start + 1);
        int[][] ans = new int[smallans1.length + smallans2.length][];
        int l = 0;
        for (int i = 0; i < smallans2.length; i++) {
            ans[l] = new int[smallans2[0].length];
            for (int j = 0; j < smallans2[0].length; j++) {
                ans[l][j] = smallans2[i][j];
            }
            l++;
        }
        for (int i = 0; i < smallans1.length; i++) {
            ans[l] = new int[smallans1[0].length + 1];
            ans[l][0] = input[start];
            for (int j = 1; j <= smallans1[0].length; j++) {
                ans[l][j] = smallans1[i][j - 1];
            }
            l++;
        }
        return ans;
    }

    public static int[][] subsetsSumK(int input[], int k) {
        return subsetsSumK(input, k, 0);

    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 17, 1, 18, 15, 3, 17};
        int target = 6;
        int[][] res = subsetsSumK(arr, target);
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(re[j] + " ");
            }
            System.out.println();
        }
    }
}
