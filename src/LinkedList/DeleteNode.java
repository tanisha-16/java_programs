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
public class DeleteNode {

    public static Node<Integer> delete(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            return head;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

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

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        head = delete(head, 4);
        print(head);
    }
}
