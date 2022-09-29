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
public class ConstructTreeFrompreandin {

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder, int pres, int pree, int ins, int ine) {
        if (ins > ine) {
            return null;
        }
        int data = preOrder[pres], c = -1;

        BinaryTreeNode<Integer> result = new BinaryTreeNode<>(data);
        for (int i = ins; i <= ine; i++) {
            if (data == inOrder[i]) {
                c = i;
                break;
            }

        }
        if (c == -1) {
            return null;
        }
        int leftInS = ins;
        int leftInE = c - 1;
        int leftPreS = pres + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = c + 1;
        int rightInE = ine;
        int rightPreS = leftPreE + 1;
        int rightPreE = pree;
        result.left = buildTreeHelper(preOrder, inOrder, leftPreS, leftPreE, leftInS, leftInE);
        result.right = buildTreeHelper(preOrder, inOrder, rightPreS, rightPreE, rightInS, rightInE);
        return result;

    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return buildTreeHelper(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
    }
}
