/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class dividenum {
    public static int dividen(int a,int b){
        if(b==0){
            return Integer.MIN_VALUE;
        }
        return a/b;
    }
    public static void divide(int a,int b){
        if(b==0){
            return;
        }
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        divide(a,b);
        int res=dividen(a,b);
        System.out.println(res);
    }
}
