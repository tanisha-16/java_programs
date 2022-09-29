/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class DeleteAlternateNode {
    public static Node input(){
        Node head=null,tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        while(data!=-1){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void deleteAlternateNodes(Node head) {
        //Your code goes here
        if(head==null){
            return;
        }
        while(head!=null && head.next!=null){
            System.out.print(head.data+" ");
            
            head.next=head.next.next;
            head=head.next;
        }
        System.out.println("");
    }
    static Node deleteAlt(Node head) 
{ 
    if (head == null) 
        return head; 
  
   
  
    /* Change the next link of head */
    head.next = head.next.next; 
  
  
    /* Recursively call for the new next of head */
    head.next = deleteAlt(head.next);
    return head;
} 
    public static void main(String[] args) {
        Node ll=input();
        deleteAlternateNodes(ll);
        print(ll);
    }
}
