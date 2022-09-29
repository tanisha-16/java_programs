/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_and_Space_Complexity;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class PairSumInArray {
   // public static int pairSumdefective(int[] arr, int num) {
    //Your code goes here

//        int start=0;
//        int end=arr.length-1;
//        int i=0;
//        int j=0;
//        int count=0, counts=1, counte=1;
//        Arrays.sort(arr);
//        if(arr[start]==arr[end]&&arr[start]!=0){
//            while(start<end){
//                count+=end-start;
//                start++;
//            }
//        }else{
//            while(start<end){
//            if(arr[start]+arr[end]==num){
//                // count++;
//                if(arr[start]==arr[start+1]){
//                    counts++;
//                    start++;
//                    if(arr[end]==arr[end-1]){
//                    	counte++;
//                        end--;
//                }
//                    count=counts*counte;
//                }else{
//                    count++;
//                    start++;
//                	end--;
//                }
//                
//            }else if(arr[start]+arr[end]<num){
//                start++;
//            }
//                else{
//                    end--;
//                }
//        }
//        }
//        return count;
    //}
    public static int pairSum(int[] arr, int num) {
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        int j = arr.length - 1;
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

    public static void main(String[] args) {
        //int[] arr = {0,6,0,0};
        int[] arr={1 ,3 ,6 ,2 ,5 ,4 ,3 ,2 ,4};
        System.out.println(pairSum(arr, 7));
    }
}
