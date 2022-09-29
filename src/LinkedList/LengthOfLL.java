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
public class LengthOfLL {

    public static Node<Integer> takeinput() {
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

    public static int length(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        int c = 1;
        while (head.next != null) {
            head = head.next;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        System.out.println(length(head));
    }
}
