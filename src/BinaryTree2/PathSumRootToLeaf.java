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
public class PathSumRootToLeaf {

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        rootToLeafPathsSumToKHelper(root, k, "");
    }

    public static void rootToLeafPathsSumToKHelper(BinaryTreeNode<Integer> root, int k, String s) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null && root.data==k){
            System.out.println(s+root.data);
        }
        s+=root.data+" ";
        rootToLeafPathsSumToKHelper(root.left, k-root.data, s);
        rootToLeafPathsSumToKHelper(root.right, k-root.data, s);
    }
}
