/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Lenovo
 */
public class FirstIndexOfNumber {

    public static int firstIndex(int input[], int x, int startIndex) {
        if (startIndex > input.length - 1) {
            return -1;
        }
        if (input[startIndex] == x) {
            return startIndex;
        }
        return firstIndex(input, x, startIndex + 1);
    }

    public static int firstIndex(int input[], int x) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         */
        return firstIndex(input, x, 0);
    }

    public static void main(String[] args) {
        int[] input = {2, 8, 5, 6, 23, 45, 10};
        System.out.println(firstIndex(input, 10));
    }
}
