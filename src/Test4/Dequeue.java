/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test4;

/**
 *
 * @author Lenovo
 */
public class Dequeue {
    int[] arr=new int[0];
    int s=0;
    int size;
    public Dequeue(int size){
        this.size=size;
    }
    public void insertFront(int e){
        if(s==size){
            System.out.print(-1);
        }
        int[] temp=arr;
        arr=new int[temp.length+1];
        arr[0]=e;
        for(int i=1;i<arr.length;i++){
            arr[i]=temp[i-1];
        }
    }
    public void insertRear(int e){
        if(s==size){
            System.out.print(-1);
        }
        int[] temp = arr;
        arr = new int[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        arr[temp.length] = e;
    }
    public int deleteFront(){
        int[] temp=arr;
        arr=new int[temp.length-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i+1];
        }
        return temp[0];
    }
    public int deleteRear(){
        return 0;
    }
    public int getFront(){
        return 0;
    }
    public int getRear(){
        return 0;
    }
}
