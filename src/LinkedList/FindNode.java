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
public class FindNode {

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

    public static int find(Node<Integer> head, int n) {
        int c = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data == n) {
                return c;
            }
            temp = temp.next;
            c++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node<Integer> ll = takeInput();
        System.out.println(find(ll, 6));
    }
}
