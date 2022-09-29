/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

/**
 *
 * @author Lenovo
 */
public class BSTtoSortedLL {

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        Pair1 ans = helper(root);
        return ans.head;
    }

    public static Pair1 helper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair1 ans = new Pair1();
            ans.head = null;
            ans.tail = null;
            return ans;
        }
        Pair1 lefttree = helper(root.left);
        LinkedListNode<Integer> node = new LinkedListNode<>(root.data);
        Pair1 righttree = helper(root.right);
        Pair1 output = new Pair1();
        if (lefttree.head != null) {
            output.head = lefttree.head;
            lefttree.tail.next = node;
        } else {
            output.head = node;
        }
        node.next = righttree.head;
        if (righttree.head == null) {
            output.tail = node;
        } else {
            output.tail = righttree.tail;
        }
        return output;
    }
}

class Pair1 {

    LinkedListNode<Integer> head, tail;
}

class LinkedListNode<T> {

    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
