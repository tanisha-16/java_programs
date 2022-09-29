/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import Queues.*;

/**
 *
 * @author Lenovo
 */
public class QueueLinkedList<T> {
    private Node<T> front, rear;
    private int size;
    
    public QueueLinkedList(){
        front=null;
        rear=null;
        size=0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public void enqueue(T e){
        Node<T> newNode=new Node<>(e);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
            size++;
        }
        else{
            rear.next=newNode;
            rear=rear.next;
            size++;
        }
    }
    public T dequeue(){
        if(isEmpty()){
            
        }
        size--;
        T temp=front.data;
        front=front.next;
        return temp;
    }
    
    public T front(){
        if(isEmpty()){
            
        }
        return front.data;
    }
}
