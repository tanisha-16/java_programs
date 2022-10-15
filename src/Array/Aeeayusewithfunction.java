/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Aeeayusewithfunction {
    public static int[] inputarray(){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        return a;
    }
    public static void printarray(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=inputarray();
        printarray(arr);
        
    }
    
}
//changes
