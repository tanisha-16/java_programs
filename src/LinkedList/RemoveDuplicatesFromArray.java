/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class RemoveDuplicatesFromArray {

    public static ArrayList<Integer> removeduplicate(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 20, 20, 30, 40, 50, 50, 10};
        ArrayList<Integer> op = removeduplicate(arr);
        for (int i : op) {
            System.out.print(i + " ");
        }
    }
}
