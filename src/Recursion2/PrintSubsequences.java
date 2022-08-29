/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2;

/**
 *
 * @author Lenovo
 */
public class PrintSubsequences {
    public static void printsubsequence(String str, String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        printsubsequence(str.substring(1),res);
        printsubsequence(str.substring(1),res+str.charAt(0));
    }
    public static void printsubsequence(String str){
        printsubsequence(str,"");
    }
    public static void main(String[] args) {
        printsubsequence("XYZ");
    }
}
