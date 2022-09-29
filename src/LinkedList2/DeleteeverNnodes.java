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
public class DeleteeverNnodes {

    public static Node<Integer> takeInput() {
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

        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if (head == null || N == 0) {
            return head;
        }
        if (M == 0) {
            return null;
        }
        Node<Integer> curr = head, temp;
        int count;
        while (curr != null) {
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return head;
            }
            temp = curr.next;
            for (count = 1; count <= N && temp != null; count++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int m = 2, n = 3;
        head = skipMdeleteN(head, m, n);
        print(head);
    }
}
