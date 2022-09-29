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
public class EvenAfterOddList {

    public static Node<Integer> evenafterodd(Node<Integer> head) {
        Node<Integer> oh = null, ot = null, eh = null, et = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (eh == null && et == null) {
                    eh = head;
                    et = head;
                } else {
                    et.next = head;
                    et = et.next;
                }
                head = head.next;
            } else {
                if (oh == null && ot == null) {
                    oh = head;
                    ot = head;
                } else {
                    ot.next = head;
                    ot = ot.next;
                }
                head = head.next;
            }
        }
        if (oh != null) {
            ot.next = eh;
        } else {
            return eh;
        }
        if (eh != null) {
            et.next = null;
        }
        return oh;
    }

    public static Node<Integer> sortEvenOdd1(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallAns = sortEvenOdd1(head.next);
        Node<Integer> temp = smallAns;
        if (head.data % 2 == 0) {
            if (temp.data % 2 == 0) {
                head.next = temp;
                return head;
            }
            while (temp.next != null && temp.next.data % 2 != 0) {
                temp = temp.next;
            }
            Node<Integer> t1 = temp.next;
            temp.next = head;
            head.next = t1;
            return smallAns;
        } else {
            head.next = smallAns;
            return head;
        }
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
        //head=evenafterodd(head);
        head = sortEvenOdd1(head);
        print(head);
    }
}
