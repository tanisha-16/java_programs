/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Primeprime2ton {
    public static boolean checkprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printprime(int n){
        for(int i=2;i<=n;i++){
            boolean isprime=checkprime(i);
            if(isprime){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printprime(n);
        
    }
}
