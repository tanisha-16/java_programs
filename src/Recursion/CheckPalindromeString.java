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
public class CheckPalindromeString {

    public static boolean isStringPalindrome(String input, int start, int end) {
        if(start==end){
            return true;
        }
        if(input.charAt(start)!=input.charAt(end)){
            return false;
        }
        if(start<end+1){
            return isStringPalindrome(input, start+1, end-1);
        }
        return true;
    }

    public static boolean isStringPalindrome(String input) {
        if (input.length() == 0) {
            return true;
        }
        return isStringPalindrome(input, 0, input.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("malayalam"));
    }
}
