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
public class Pushzerosatend {
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int[] temp=new int[arr.length];
        
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    public static void pushZerosAtEnd1(int[] arr) {
    	//Your code goes here
        
        int k=0,i=0;
        while(i<arr.length){
            if(arr[i]==0){
                i++;    
            }
            else{
                arr[k]=arr[i];
                k++;
                i++;
            }
        }
        while(k<i){
            arr[k]=0;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,6,0,0,1,9,0,8,0};
        pushZerosAtEnd1(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
