/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author Lenovo
 */
import java.util.LinkedList;
import java.util.Queue;
public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.size()+" "+q.poll()+" "+q.peek());
    }
}
