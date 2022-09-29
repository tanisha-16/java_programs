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
public class QueueUse {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException{
//        Queues_using_array q=new Queues_using_array();
//        System.out.println(q.size());
//        q.enqueue(20);
//        System.out.println(q.size());
//        q.enqueue(90);
//        q.enqueue(103);
//        q.enqueue(120);
//        q.dequeue();
//        System.out.println(q.size()+" "+q.front());
        
        QueueArray qu=new QueueArray();
        System.out.println(qu.size()+" "+qu.isEmpty());
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        System.out.println(qu.front()+" "+qu.dequeue());
        System.out.println(qu.size()+" "+qu.front()+" "+qu.dequeue()+" "+qu.dequeue()+" "+qu.dequeue());
        
        
    }
}
