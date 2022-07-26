/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Lenovo
 */
public class Intersectionofarray {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");
                    arr2[j]=-1; //change the 2nd array of value to -1 so it can't be compare again
                    break;
                }
            }
           
        }
        
    }
    public static void main(String[] args) {
        int[] arr1={34,45,89,76,54};
        int[] arr2={34,23,89,54};
        intersections(arr1,arr2);
    }
}
