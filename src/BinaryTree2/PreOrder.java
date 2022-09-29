/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

/**
 *
 * @author Lenovo
 */
public class PreOrder {
    public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}
}
