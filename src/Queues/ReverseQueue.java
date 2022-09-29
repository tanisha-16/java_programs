/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Lenovo
 */
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input){
        if(input.isEmpty()){
            return;
        }
        int e=input.poll();
        reverseQueue(input);
        input.add(e);
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        for(int i=10;i<20;i++){
            q.add(i+1);
        }
        reverseQueue(q);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
