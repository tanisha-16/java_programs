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
public class Createandinsertduplicate {

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> copy = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> save = root.left;
        root.left = copy;
        copy.left = save;
        insertDuplicateNode(save);
        insertDuplicateNode(root.right);

    }
}
