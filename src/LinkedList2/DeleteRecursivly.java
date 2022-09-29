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
public class DeleteRecursivly {
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
    public static Node<Integer> delete(Node<Integer> head,int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next=delete(head.next, pos-1);
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> list=takeInput();
        Node<Integer> o=delete(list,4);
        print(o);
    }
}
