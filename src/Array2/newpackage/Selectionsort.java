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
public class Selectionsort {
    public static void selectionSort1(int[] arr) {
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]>arr[j]){
                    min=arr[j];
                    minidx=j;
                }
            }
            if(minidx!=i){
                arr[minidx]=arr[i];
                arr[i]=min;
                
            }
        }
    }
    public static void selectionSort(int[] arr) {
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }   
    public static void main(String[] args) {
        int[] arr={75,56,23,12,89,34,100};
//        selectionSort(arr);
        selectionSort1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
