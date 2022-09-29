/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class InsertNodeRecursive {

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {

        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static Node<Integer> insert(Node<Integer> head, int e, int pos) {
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(e);
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            return head;
        }

        head.next = insert(head.next, e, pos - 1);
        return head;
    }
   
    public static void main(String[] args) {
        Node<Integer> l = takeInput();
        Node<Integer> res = insert(l, 10, 4);
        print(res);
    }
}
