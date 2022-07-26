/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array2.newpackage;

/**
 *
 * @author Lenovo
 */
public class Binarysearch{ 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,23,45,67,89,90};
        int target=89;
        System.out.println(binarySearch(arr,target));
    }

}