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
public class LeadersinArray {

    public static void leaders(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int j;
            for (j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    break;
                }
            }
            if (j == input.length) {
                System.out.print(input[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 34, 2, 0, -1};
        leaders(arr);
    }
}
