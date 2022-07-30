/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Lenovo
 */
public class CheckPermutation {

    //Efficient solution
    public static boolean isPermutation(String str1, String str2) {
        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)] -= 1;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "abcdaaabbdcedjhasljhdas";
        String str2 = "abcdaaabbdcedjhasljhdashkj";
        System.out.println(isPermutation(str1, str2));
    }
}
