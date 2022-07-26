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
public class Rotateanarray {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int[] temp=new int[arr.length];
        int k=0;
        for(int i=d;i<arr.length&&k<arr.length;i++,k++){
            temp[k]=arr[i];
        }
        int j=0;
        while(k<arr.length){
            temp[k++]=arr[j++];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,2);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
