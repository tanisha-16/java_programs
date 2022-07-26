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
public class Secondlargestelement {
    
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int max=Integer.MIN_VALUE ,secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondmax&&arr[i]!=max){
                secondmax=arr[i];
            }
        }
        return secondmax;
        }
    public static int secondLargestElement1(int[] arr) {
    	//Your code goes here
        int max=Integer.MIN_VALUE ,secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
                
            }
            if(arr[i]<max&&arr[i]>secondmax){
                secondmax=arr[i]; //to check the duplicate value of max
            }
        }
        return secondmax;
        }
     public static void main(String[] args) {
        int[] arr={5,5,3,3,4,4};
         System.out.println(secondLargestElement1(arr));
    }
}
