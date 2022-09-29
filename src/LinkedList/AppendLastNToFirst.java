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
public class AppendLastNToFirst {

    public static Node<Integer> append(Node<Integer> head, int n) {

        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int newcount = count - n;
        count = 0;
        Node<Integer> temp1 = head;
        while (count < newcount - 1) {
            temp1 = temp1.next;
            count++;
        }
        Node<Integer> temp2 = temp1.next;
        Node<Integer> temp3 = temp1.next;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = head;
        temp1.next = null;
        return temp3;

    }

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

    public static void main(String[] args) {
        Node<Integer> ll = takeInput();
        Node<Integer> res = append(ll, 2);
        print(res);
    }
}
