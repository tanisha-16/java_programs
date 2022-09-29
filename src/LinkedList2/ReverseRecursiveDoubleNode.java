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
public class ReverseRecursiveDoubleNode {
//Time complexity: O(n)
    public static DoubleNode reverse(Node<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode obj = new DoubleNode();
            obj.head = head;
            obj.tail = head;
            return obj;
        }
        DoubleNode res = reverse(head.next);
        res.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = res.head;
        ans.tail = head;
        return ans;
    }

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

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        DoubleNode ans = reverse(head);
        print(ans.head);

    }
}
