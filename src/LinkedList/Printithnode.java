/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Printithnode {

    public static Node<Integer> input() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
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

    public static void printIthNode(Node<Integer> head, int i) {
        //Your code goes here
        int c = 0;
        while (head != null) {
            if (c == i) {
                System.out.println(head.data);
                break;
            }
            c++;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        printIthNode(head, 4);
    }
}
