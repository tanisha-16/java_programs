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
public class MirrorBT {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            BinaryTreeNode<Integer> temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }
}
