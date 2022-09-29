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
public class BubbleSortLL {
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
	LinkedListNode<Integer> temp=head,shead=head;
	int l=1;
	while(temp!=null) {
		temp=temp.next;
		l++;
	}
	for(int i=1;i<l;i++) {
		LinkedListNode<Integer> prev=null,curr=shead;
		for(int j=1;j<l-i;j++) {
			while(curr.next!=null) {
			if(curr.data<=curr.next.data) {
				prev=curr;
				curr=curr.next;
				
			}else {
				LinkedListNode<Integer> nex=curr.next;
				
		       if(prev==null) {
			      curr.next=nex.next;
			      nex.next=curr;
			      prev=nex;
			      shead=prev;
			      //curr=curr.next;
		       }else {
			      prev.next=curr.next;
			      curr.next=nex.next;
			      nex.next=curr;
			     // nex=curr;
			      prev=nex;
		       }
			}
			}
		}
	}
        return shead;
	}
    public static Node<Integer> BubbleSort1(Node<Integer> head){
        if(head==null||head.next==null){
            return head;
        }
        int n=Count(head);
        for(int i=0;i<n-1;i++){
            Node<Integer> prev=null, curr=head, next=head.next;
            while(curr.next!=null){
                if(curr.data>curr.next.data){
                    if(prev==null){
                        curr.next=next.next;
                        next.next=curr;
                        prev=next;
                        head=prev;
                    }else{
                        next=curr.next;
                        prev.next=next;
                        curr.next=next.next;
                        next.next=curr;
                        prev=prev.next;
                    }
                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;
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
    public static int Count(Node<Integer> head){
        int c=0;
        Node<Integer> temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static void main(String[] args) {
        Node<Integer> head=takeInput();
        head=BubbleSort1(head);
        print(head);
    }
}
