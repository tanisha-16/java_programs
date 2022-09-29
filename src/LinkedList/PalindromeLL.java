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
public class PalindromeLL {

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
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static boolean ispalindrome1(Node<Integer> head) {
        if (head == null) {
            return true;
        }
        Node<Integer> temp = head, mid, h2;
        mid = midPoint(temp);
        h2 = mid.next;
        mid.next = null;
        h2 = reverse(h2);

        boolean flag = true;
        while (temp != null && h2 != null && flag) {
            if (!temp.data.equals(h2.data)) {
                flag = false;
            }
            temp = temp.next;
            h2 = h2.next;
        }
        return flag;
    }

    public static boolean ispalindrome(Node<Integer> head) {
        if (head == null) {
            return true;
        }
        Node<Integer> temp = head;
        Node<Integer> mid = midPoint(temp);
        Node<Integer> rhead = reverse(mid);
        while (head != null) {
            if (head.data.equals(rhead.data)) {
                head = head.next;
                rhead = rhead.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        Node<Integer> newhead = head, prev = null, temp;
        while (newhead != null) {
            temp = newhead.next;
            newhead.next = prev;
            prev = newhead;
            newhead = temp;
        }
        return prev;
    }

    private static Node<Integer> midPoint(Node<Integer> head) {
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> lin = input();
        System.out.println(ispalindrome(lin));
    }
}
