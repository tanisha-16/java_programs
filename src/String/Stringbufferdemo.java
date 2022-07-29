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
class StringBufferdemo {

    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("abc");
        str.setCharAt(0, 'd');
        str.append("def");
        System.out.println(str + " " + str.length());
        String s = "d";
        for (int i = 0; i < 5; i++) {
            s = s + 'z';
        }
        System.out.println(s);
    }
}
