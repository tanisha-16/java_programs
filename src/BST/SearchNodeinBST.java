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
public class SearchNodeinBST {

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data == k) {
            return true;
        }
        if (root.data > k) {
            return searchInBST(root.left, k);
        } else {
            return searchInBST(root.right, k);
        }
    }
}
