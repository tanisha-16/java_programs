/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class QueueUsing2Stacks {
    private Stack<Integer> s1,s2;
    

    public QueueUsing2Stacks() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public int size(){
        return s1.size();
    }
    
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    
    public int front(){
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int f=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return f;
    }
    public int dequeue(){
        if(s1.isEmpty()){
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int f=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return f;
    }
    public void enqueue(int e){
        s1.push(e);
    }
    public static void main(String[] args) {
        QueueUsing2Stacks q=new QueueUsing2Stacks();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.size());
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.dequeue()+" "+q.size());
    }
}
