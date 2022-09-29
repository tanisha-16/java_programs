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
public class MergeSort {

    public static Node<Integer> input() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int element = s.nextInt();
        while (element != -1) {
            Node<Integer> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            element = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> mergesort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> mid = midLL(head);
        Node<Integer> mid1 = mid.next;
        mid.next = null;
        Node<Integer> part1 = mergesort(head);
        Node<Integer> part2 = mergesort(mid1);
        Node<Integer> res = mergeTwoSortedLinkedLists(part1, part2);
        return res;
    }

    public static Node<Integer> midLL(Node<Integer> head) {
        Node<Integer> fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node<Integer> h = null, t = null;
        if (head1.data <= head2.data) {
            h = head1;
            t = head1;
            head1 = head1.next;
        } else {
            h = head2;
            t = head2;
            head2 = head2.next;
        }
        while (head1 != null && head2 != null) {
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

    public static void main(String[] args) {
        Node<Integer> ll = input();
        Node<Integer> mll = mergesort(ll);
        print(mll);
    }
}
