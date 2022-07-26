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
public class Pattern7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int k=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(k+" ");
                j++;
                k++;
            }
            System.out.println("");
            i++;
            
        }
    }
}