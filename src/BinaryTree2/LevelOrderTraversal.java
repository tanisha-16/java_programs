/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Lenovo
 */
public class LevelOrderTraversal {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int n=q.size();
            while(n!=0){
                BinaryTreeNode<Integer> front=q.poll();
                System.out.print(front.data+" ");
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
                n--;
            }
            System.out.println();
        }
	}
}
