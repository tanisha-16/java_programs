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
public class Swapalternate {
    public static void main(String[] args) {
        int[] arr={12,56,87,54,63,10,67};
        for(int i=0,j=1;i<arr.length&&j<arr.length;i+=2,j+=2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
