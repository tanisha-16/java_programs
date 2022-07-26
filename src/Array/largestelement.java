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
import java.util.Scanner;
public class largestelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
