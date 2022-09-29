/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_and_Space_Complexity;

/**
 *
 * @author Lenovo
 */
public class FindUinique {
    
    public static int findUnique(int[] arr) {
        //Your code goes here
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            element = element ^ arr[i];
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 5, 6, 7, 7, 5};
        System.out.println(findUnique(arr));
    }
}
