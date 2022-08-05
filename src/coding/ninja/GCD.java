/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.ninja;

/**
 *
 * @author Lenovo
 */
public class GCD {

    public static void main(String[] args) {
        int a = 10, b = 10;
        int temp = 1;
        if (a == b) {
            System.out.print(a);
        } else if (a % b == 0) {
            System.out.println(b);
        } else {
            while (temp != 0) {
                temp = a % b;
                a = b;
                b = temp;
            }
            System.out.println(a);
        }

    }
}
