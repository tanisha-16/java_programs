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
public class QueueArray {

    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public void enqueue(int e) throws QueueFullException {
        if (size == data.length) {
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        size++;
        //rear++;

        rear = (rear + 1) % data.length;
//        if(rear==data.length){
//            rear=0;
//        }
        data[rear] = e;

    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        //front++;
        front = (front + 1) % data.length;
//        if(front==data.length){
//            front=0;
//        }
        size--;
        if (size() == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    private void doubleCapacity() {
        int[] temp=data;
        data=new int[2*temp.length];
        int k=0;
        for(int i=front;i<temp.length;i++){
            data[k]=temp[i];
            k++;
        }
        for(int i=0;i<front;i++){
            data[k]=temp[i];
            k++;
        }
        front=0;
        rear=temp.length-1;

    }

}
