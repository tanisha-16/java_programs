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
public class MergetwosortedLL {

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

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        Node<Integer> h = null, t = null;
        while (head1 != null && head2 != null) {
            if (h == null && t == null) {
                if (head1.data <= head2.data) {
                    h = head1;
                    t = head1;
                    head1 = head1.next;
                } else {
                    h = head2;
                    t = head2;
                    head2 = head2.next;
                }
            }
            if (head1.data <= head2.data) {
                t.next = head1;
                t = t.next;
                head1 = head1.next;
            } else {
                t.next = head2;
                t = t.next;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            t.next = head1;
        }
        if (head2 != null) {
            t.next = head2;
        }
        return h;
    }

    public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node<Integer> t1 = head1, t2 = head2, tail = null, head = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            tail.next = t2;
        }
        if (t2 == null) {
            tail.next = t1;
        }
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> l1 = takeInput();
        Node<Integer> l2 = takeInput();
        Node<Integer> res = mergeTwoList(l1, l2);
//Node<Integer> res=mergeTwoSortedLinkedLists(l1, l2);
        print(res);
    }

}
