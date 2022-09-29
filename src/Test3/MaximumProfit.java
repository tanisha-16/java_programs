/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class MaximumProfit {

    public static int maximumProfit(int budget[]) {
        // Write your code here
        Arrays.sort(budget);
        int max = Integer.MIN_VALUE;
        int n = budget.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,budget[i]*(n-i));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {30, 20, 53, 14};
        System.out.println(maximumProfit(arr));
    }
}
