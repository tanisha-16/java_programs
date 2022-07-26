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
public class Findunique {
    public static int findUnique(int[] arr){
		//Your code goes here
        int num=-1;
        for(int i=0;i<arr.length;i++){
            int unique=arr[i];
            boolean isunique=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                if(unique==arr[j]){
                    isunique=false;
                    break;
                }
                }
            }
            if(isunique){
                num=unique;
            }
        }
        return num;
    }
    public static int findCommon(int[] arr){
		//Your code goes here
        
        for(int i=0;i<arr.length;i++){
            int unique=arr[i];
            
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                if(unique==arr[j]){
                    return arr[j];
                }
                }
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int[] arr={1,2,3,5,7,9,1,2,5,7,9};
        int[] arr1={56,70,89,67,70};
        
        
//        int num=0;
//        for(int i=0;i<arr.length;i++){
//            boolean isunique=true;
//            int unique=arr[i];
//            for(int j=0;j<arr.length;j++){
//                if(i!=j){
//                    if(unique==arr[j]){
//                        isunique=false;
//                        break;
//                    }
//                }
//                
//            }
//            if(isunique){
////                System.out.println(unique);
//                num=unique;
//            }
//        }
         System.out.println(findUnique(arr));
         System.out.println(findCommon(arr1));
    }
}
