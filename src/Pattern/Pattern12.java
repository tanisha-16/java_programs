/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int k=n;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}