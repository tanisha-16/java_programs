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
public class ReverseALL {

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

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void reverse(Node<Integer> head) {
        Node<Integer> temp, prev = null;
        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        head = prev;
        print(head);
    }

    public static void reverseRecursive(Node<Integer> head) {
        if (head == null) {
            return;
        }
        reverseRecursive(head.next);
        System.out.print(head.data + " ");
    }

    private static Node<Integer> reverseIt(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> tail = head.next;
        Node<Integer> ans = reverseIt(head.next);
        tail.next = head;
        head.next = null;
        return ans;

    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        Node<Integer> head1 = input();
        reverse(head);
        reverseRecursive(head1);

    }
}
