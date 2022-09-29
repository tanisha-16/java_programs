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
public class DuplicateElement {
    
    public static int findDuplicate(int[] arr) {
        
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum1 = ((n - 1) * (n - 2)) / 2;
        return sum - sum1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 7, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(findDuplicate(arr));
    }
}
