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
public class StackUsingLL<T> {

    private Node<T> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T top() {
        return head.data;
    }

    public void push(T e) {
        Node<T> temp = new Node<>(e);
        temp.next = head;
        head = temp;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            return (T) head;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

class Stack {

    //Define the data members
    Node<Integer> head;
    int size;

    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }

    /*----------------- Public Functions of Stack -----------------*/
    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node temp = new Node(element);

        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if (isEmpty()) {
            return -1;
        } else {
            int temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
    }

    public int top() {
        //Implement the top() function
        if (isEmpty()) {
            return -1;
        } else {
            return head.data;
        }
    }
}
