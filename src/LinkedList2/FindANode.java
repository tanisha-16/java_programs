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
public class FindANode {
    
    public static void print(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        print(head.next);
    }
    
    public static Node<Integer> input(){
        Node<Integer> head=null, tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static int findNodeRec(Node<Integer> head, int n, int index) {
        //Your code goes here
        if (head == null) {
            return -1;
        }
        if (head.data == n) {
            return index + 1;
        }
        return findNodeRec(head.next, n, index + 1);
    }

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        return findNodeRec(head, n, -1);
    }
    public static void main(String[] args) {
        Node<Integer> list=input();
        Scanner s=new Scanner(System.in);
        int e=s.nextInt();
        System.out.println(findNodeRec(list, e));
    }
}
