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
public class Mergetwosortedarray {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n=arr1.length+arr2.length;
        int[] temp=new int[n];
        int i=0;
        int k=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                k++;
                i++;
            }else{
                temp[k]=arr2[j];
                k++;
                j++;
            }
        }
       
        if(i!=arr1.length){
            while(i<arr1.length){
                temp[k++]=arr1[i++];
            }
        }else{
            while(j<arr2.length){
                temp[k++]=arr2[j++];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr1={23,45,67,89,90};
        int[] arr2={34,47,78,82,100};
        int[] res=merge(arr1, arr2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

}
