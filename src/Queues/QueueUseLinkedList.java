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
public class QueueUseLinkedList {
    public static void main(String[] args) {
        QueueLinkedList q=new QueueLinkedList();
        System.out.println(q.size());
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.size()+" "+q.front());
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.dequeue());
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println(q.front()+" "+q.size());
    }
}
