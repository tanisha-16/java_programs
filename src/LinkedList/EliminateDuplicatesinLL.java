/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class EliminateDuplicatesinLL {

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
                tail = newNode; // tail = tail.next
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        if (head == null) {
            return head;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            if (temp.data.equals(temp.next.data)) {  //Compares the two digit == compares the address
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> ll = removeDuplicates(head);
        print(ll);
    }
}
