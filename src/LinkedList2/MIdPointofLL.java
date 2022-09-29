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
public class MIdPointofLL {

    public static Node<Integer> midPoint_better(Node<Integer> head) {
        //Your code goes here

        if (head == null) {
            return head;
        }
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> midPoint_normal(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int ncount;
        if (count % 2 != 0) {
            ncount = count / 2;
        } else {
            ncount = count / 2 - 1;
        }
        Node<Integer> temp1 = head;
        count = 0;
        while (temp1 != null) {
            if (count == ncount) {
                return temp1;
            }
            count++;
            temp1 = temp1.next;
        }
        return head;
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

    public static void main(String[] args) {
        Node<Integer> ll=takeInput();
        Node<Integer> res1=midPoint_better(ll), res2=midPoint_normal(ll);
        System.out.println(res1.data+" "+res2.data);
    }
}
