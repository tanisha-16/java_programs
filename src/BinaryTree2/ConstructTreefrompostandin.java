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
public class ConstructTreefrompostandin {

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder, int postS, int postE, int inS, int inE) {
        if (inS > inE) {
            return null;
        }
        int data = postOrder[postE], c = -1;
        BinaryTreeNode<Integer> result = new BinaryTreeNode<>(data);
        for (int i = inS; i <= inE; i++) {
            if (data == inOrder[i]) {
                c = i;
                break;
            }
        }
        if (c == -1) {
            return null;
        }
        int leftinS = inS;
        int leftinE = c - 1;
        int leftpostS = postS;
        int leftpostE = leftinE - leftinS + leftpostS;
        int rightinS = c + 1;
        int rightinE = inE;
        int rightpostS = leftpostE + 1;
        int rightpostE = postE - 1;
        result.left = buildTreeHelper(postOrder, inOrder, leftpostS, leftpostE, leftinS, leftinE);
        result.right = buildTreeHelper(postOrder, inOrder, rightpostS, rightpostE, rightinS, rightinE);
        return result;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        
        return buildTreeHelper(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
    }
}
