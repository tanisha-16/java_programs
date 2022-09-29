/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList2;

/**
 *
 * @author Lenovo
 */
public class LinkedListNode<T> {

    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        next = null;
    }

}
