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
public class CheckSorted {

    public static boolean checkSorted(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        int[] smallarr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallarr[i - 1] = arr[i];
        }
        boolean smallans = checkSorted(smallarr);
        if (!smallans) {
            return false;
        }
        if (arr[0] <= arr[1]) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkSorted_1(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int[] smallarr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallarr[i - 1] = arr[i];
        }
        return checkSorted(smallarr);
    }
    public static boolean checkSorted_2(int[] arr,int startIndex) {
        if (arr.length-1 <= startIndex) {
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }
        return checkSorted_2(arr,startIndex+1);
    }
    public static boolean checkSorted_2(int[] arr) {
        
        return checkSorted_2(arr,0);
    }
    public static void main(String[] args) {
        int[] checkarr = {2, 2, 3, 4, 8, 9};
        System.out.println(checkSorted(checkarr));
        System.out.println(checkSorted_1(checkarr));
        System.out.println(checkSorted_2(checkarr));
    }
}
