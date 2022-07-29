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
public class CountWords {

    public static void main(String[] args) {
        String str1 = "Coding is fun";
        int c = 0;
        if (str1.length() == 0) {
            System.out.println(c);
        } else {
            str1 += " ";
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ') {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
