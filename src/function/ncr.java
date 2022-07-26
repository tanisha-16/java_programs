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

public class ncr {
    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static boolean isprime(int n){
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void printtilln(int n){
        if(n<=0){
            return;
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int num=factorial(n);
        int den1=factorial(r);
        int den2=factorial(n-r);
        int res=num/(den1*den2);
        System.out.println(res);
        int a=s.nextInt();
        System.out.println(isprime(a));
        printtilln(a);
        
    }
}
