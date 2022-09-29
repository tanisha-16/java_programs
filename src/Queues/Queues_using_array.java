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
public class Queues_using_array {
    int[] arr=new int[0];
    
    public void enqueue(int e){
        int[] temp=arr;
        arr=new int[temp.length+1];
        arr[0]=e;
        for(int i=1;i<arr.length;i++){
            arr[i]=temp[i-1];
        }
    }

    public int dequeue(){
        int[] temp=arr;
        arr=new int[temp.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i+1];
        }
        return temp[0];
    }
    
    public int size(){
        return arr.length;
    }
    
    public int front(){
        return arr[0];
    }
    
    public boolean isEmpty(){
        return size()==0;
    }
    
}
