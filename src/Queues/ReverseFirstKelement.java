/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class ReverseFirstKelement {
    public static Queue<Integer> reversekelementQueue(Queue<Integer> input, int k){
        Stack<Integer> s=new Stack<>();
        Queue<Integer> newq=new LinkedList<>();
        while(!input.isEmpty()&&k>0){
            s.push(input.poll());
            k--;
        }
        
        while(!s.isEmpty()){
            newq.add(s.pop());
        }
        
        while(!input.isEmpty()){
            newq.add(input.poll());
        }
        return newq;
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        for(int i=10;i<20;i++){
            q.add(i+1);
        }
        int k=4;
        q=reversekelementQueue(q, k);
        
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
    }
}
