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
import java.util.*;

public class TripletSum {

    public static int pairSum(int[] arr, int startp, int endp, int num) {

        int count = 0;
        int i = startp;
        int j = endp;
        while (i < j) {
            if (arr[i] + arr[j] < num) {
                i++;
            } else if (arr[i] + arr[j] > num) {
                j--;
            } else {
                if (arr[i] == arr[j]) {
                    int m = j - i + 1;
                    count += m * (m - 1) / 2;
                    break;
                }
                // important step
                int start = i + 1;
                int end = j - 1;
                while (start <= end && arr[i] == arr[start]) {
                    start++;
                }
                while (end >= start && arr[j] == arr[end]) {
                    end--;
                }
                int d1 = start - i;
                int d2 = j - end;
                count += d1 * d2;
                i = start;
                j = end;
            }
        }
        return count;
    }

    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         for(int k=j+1;k<arr.length;k++){
        //             if(arr[i]+arr[j]+arr[k]==num){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // return count;

        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int finalcount = 0;

        for (int i = 0; i < arr.length; i++) {
            int pairsumfor = num - arr[i];
            finalcount += pairSum(arr, i + 1, arr.length - 1, pairsumfor);
        }
        return finalcount;
    }

    public static void main(String[] args) {
        int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
        int num = 10;
        System.out.println(tripletSum(arr, num));
    }
}
