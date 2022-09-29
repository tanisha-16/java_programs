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
public class InsertNode {

    public static Node<Integer> insert(Node<Integer> head, int element, int pos) {
        Node<Integer> newNode = new Node<>(element);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        int i = 0;
        Node<Integer> temp = head;

        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        
        return head;
    }
    
    public static Node<Integer> takeInputbetter() { // O(n) time complexity
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newnode = new Node<>(data);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode; //tail=tail.next;
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
        Node<Integer> head = takeInputbetter();
        head=insert(head, 80, 3);
        print(head);
    }
}
