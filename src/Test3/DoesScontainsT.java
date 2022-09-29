/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

/**
 *
 * @author Lenovo
 */
public class DoesScontainsT {

    public static boolean checkSequence(String a, String b) {
        if (b.length() == 0) {
            return true;
        }
        if (a.length() == 0) {
            return false;
        }
        if (a.charAt(0) == b.charAt(0)) {
            return checkSequence(a.substring(1), b.substring(1));
        } else {
            return checkSequence(a.substring(1), b);
        }
    }

    public static void main(String[] args) {
        String a = "abchjsgsuohhdhyrikkknddg";
        String b = "coding";
        System.out.println(checkSequence(a, b));
    }
}
