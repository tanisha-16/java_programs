/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Lenovo
 */
public class DynamicArray {

    private int arr[];
    private int lastindex;

    public DynamicArray() {
        arr = new int[5];
        lastindex = 0;
    }

    public int size() {
        return lastindex;
    }

    public void add(int element) {
        if (lastindex == arr.length) {
            restructure();
        }
        arr[lastindex] = element;
        lastindex++;
    }

    public void set(int index, int element) {
        if (index > lastindex) {
            return;
        }
        if (index < lastindex) {
            arr[index] = element;
        } else {
            add(element);
        }
    }

    public int get(int index) {
        if (index >= lastindex) {
            return -1;
        }
        return arr[index];
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int removeLast() {
        if (size() == 0) {
            return -1;
        }
        int value = arr[lastindex - 1];
        arr[lastindex - 1] = 0;
        lastindex--;
        return value;
    }

    private void restructure() {
        int[] temp = arr;
        arr = new int[arr.length * 2];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
