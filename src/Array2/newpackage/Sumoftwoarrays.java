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
public class Sumoftwoarrays {

//    public static int getnumber(int arr[]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum * 10 + arr[i];
//        }
//        return sum;
//    }
//
//    public static int count(int n) {
//        int c = 0;
//        while (n != 0) {
//            n = n / 10;
//            c++;
//        }
//        return c;
//    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        //Your code goes here
//        int out = getnumber(arr1) + getnumber(arr2);
//        int n = count(out);
//        for (int i = n - 1; i >= 0; i--) {
//            output[i] = out % 10;
//            out = out / 10;
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(output[i] + " ");
//        }
//
         int i=arr1.length-1;
        int j=arr2.length-1;
        int k=output.length-1;
        int carr=0;
        while(i>=0&&j>=0){
            output[k]=(arr1[i]+arr2[j]+carr)%10;
            carr=(arr1[i]+arr2[j]+carr)/10;
            i--;
            j--;
            k--;
        }
        if(i<0&&j<0){
            output[0]=carr;
        }
        else{
        while(i>=0){
            output[k]=(arr1[i]+carr)%10;
            carr=(arr1[i]+carr)/10;
            i--;
            k--;
        }
        while(j>=0){
            output[k]=(arr2[j]+carr)%10;
            carr=(arr2[j]+carr)/10;
            j--;
            k--;
        }
        output[0]=carr;
        }
                for (int a = 0; a <output.length ; a++) {
            System.out.print(output[a] + " ");
        }
  }

    public static void main(String[] args) {
        int[] arr1 = {9,9,9,1,3,4};
        int[] arr2 = {2,0,6,6};
        int[] arr3 ;
        if(arr1.length>=arr2.length){
            arr3=new int[arr1.length+1];
        }
        else{
            arr3=new int[arr2.length+1];
        }
        sumOfTwoArrays(arr1, arr2, arr3);

    }
}
