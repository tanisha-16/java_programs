/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Lenovo
 */
public class NumberOfDigits {
    static int c=1;
    public static int count(int n){
        
        if(n/10==0){
            return c;
        }
        c++;
        return count(n/10);
    }
    public static void main(String[] args) {
        System.out.println(count(1));
    }
}
