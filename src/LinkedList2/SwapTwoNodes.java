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
public class SwapTwoNodes {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(i==j){
            return head;
        }
        int c = 0;
        Node<Integer> temp = head, prev = null, c1 = null, c2 = null, p1 = null, p2 = null;
        while (temp != null) {
            if (c == i) {
                p1 = prev;
                c1 = temp;
            } else if (c == j) {
                p2 = prev;
                c2 = temp;
            }
            prev = temp;
            temp = temp.next;

            c++;
        }
        if (p1 != null) {
            p1.next = c2;
        } else {
            head = c2;
        }
        if (p2 != null) {
            p2.next = c1;
        } else {
            head = c1;
        }
        Node<Integer> t1 = c2.next;
        c2.next = c1.next;
        c1.next = t1;
        return head;
    }

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
                tail = tail.next;
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

    public static void main(String[] args) {
        Node<Integer> head = input();
        int i = 0, j = 2;
        head = swapNodes(head, i, j);
        print(head);
    }
}
