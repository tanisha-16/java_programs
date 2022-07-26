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
public class Findallpairs {
    public static void printpairs(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,9};
        printpairs(arr);
    }
}
