/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Lenovo
 */
public class StackA {

    static int[] arr = new int[0];

    public static void push(int n) {

        int[] temp = arr;
        arr = new int[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        arr[temp.length] = n;
    }

    public static boolean isEmpty() {
        return arr.length == 0;
    }

    public static int top() {
        return arr[arr.length - 1];
    }

    public static int size() {
        return arr.length;
    }

    public static void pop() {

        int[] temp = arr;
        arr = new int[temp.length - 1];
        for (int i = 0; i < temp.length - 1; i++) {
            arr[i] = temp[i];
        }

    }

}
