/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class StackUsing2Queue {
    Queue<Integer> q1, q2;

    public StackUsing2Queue() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public int getSize(){
        return q1.size();
    }
    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        //Implement the pop() function
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int ans=q1.poll();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        
        return ans;
    }

    public int top() {
        //Implement the top() function
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()>1){
            q2.add(q1.poll());
        }
        int ans=q1.poll();
        q2.add(ans);
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return ans;
    }
    
    public static void main(String[] args) {
        StackUsing2Queue s=new StackUsing2Queue();
        s.push(10);
        s.push(20);
        System.out.println(s.getSize()+" "+s.pop()+" "+s.top());
    }
}
