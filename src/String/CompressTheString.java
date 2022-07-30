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
public class CompressTheString {

    public static String getCompressedString(String str) {
        // Write your code here.
        String res = "";
        int count = 1;
        int i;
        for (i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res += ch + Integer.toString(count);
                } else {
                    res += ch;
                }
                count = 1;
            }

        }
        if (count != 1) {
            res = res + str.charAt(i) + count;
        } else {
            res = res + str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "xxxxxxabbaa";
        System.out.println(getCompressedString(str));
    }
}
