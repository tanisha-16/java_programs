/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0){
			newNode.next = head;
			return newNode;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(i < pos - 1){
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
		

	}

}

//import java.util.Scanner;
//
///**
// *
// * @author Lenovo
// */
//public class LinkedListUse {
//
//    public static Node<Integer> takeInput() { //O(n^2) Time complexity
//        Node<Integer> head = null;
//        Scanner s = new Scanner(System.in);
//        int data = s.nextInt();
//        while (data != -1) {
//            Node<Integer> newnode = new Node<>(data);
//            if (head == null) {
//                head = newnode;
//            } else {
//                Node<Integer> temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = newnode;
//            }
//            data = s.nextInt();
//        }
//        return head;
//    }
//    
//    public static Node<Integer> takeInputbetter() { // O(n) time complexity
//        Node<Integer> head = null, tail=null;
//        Scanner s = new Scanner(System.in);
//        int data = s.nextInt();
//        while (data != -1) {
//            Node<Integer> newnode = new Node<>(data);
//            if (head == null) {
//                head = newnode;
//                tail=newnode;
//            } else {
//                tail.next=newnode;
//                tail=newnode; //tail=tail.next;
//            }
//            data = s.nextInt();
//        }
//        return head;
//    }
//
//    public static void print(Node<Integer> head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void increment(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while (temp != null) {
//            temp.data++;
//            temp = temp.next;
//        }
//    }
//
//    /*    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10);
//        //System.out.println(node1.data + " " + node1.next);
//        Node<Integer> node2 = new Node<>(20);
//        Node<Integer> node3 = new Node<>(30);
//        node1.next = node2;
//        node2.next = node3;             //Here we link two nodes in our linked list 
////        System.out.println(node1.data + " " + node1.next);
////        System.out.println(node2.data + " " + node2.next + " " + node2);
//        Node<Integer> head;
//        head = node1;
//        //printing our linked list
////        while (head != null) {
////            System.out.print(head.data + " ");
////            head = head.next;
////        }
//        print(head);
//        increment(node1); // This will increase the each value of a linked list
//        print(node1);
//    }
//     */
//    public static void main(String[] args) {
//        Node<Integer> head = takeInputbetter();
//        print(head);
//    }
//}
