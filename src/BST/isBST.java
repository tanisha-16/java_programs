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
public class isBST {

    public static boolean isBst_best(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data > min && root.data <= max) {
            boolean leftans = isBst_best(root.left, min, root.data - 1);
            boolean rightans = isBst_best(root.right, root.data, max);
            return leftans && rightans;
        } else {
            return false;
        }
    }
    
    

    public static Pair<Boolean, Pair<Integer, Integer>> isBst_opt(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> res = new Pair<>();
            res.first = true;
            res.second = new Pair<>();
            res.second.first = Integer.MAX_VALUE;
            res.second.second = Integer.MIN_VALUE;
            return res;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftop = isBst_opt(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightop = isBst_opt(root.right);
        int min = Math.min(root.data, Math.min(leftop.second.first, rightop.second.first));
        int max = Math.max(root.data, Math.max(leftop.second.second, rightop.second.second));
        boolean isbst = (root.data > leftop.second.second) && (root.data <= rightop.second.first) && (leftop.first) && (rightop.first);
        Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
        output.first = isbst;
        output.second = new Pair<>();
        output.second.first = min;
        output.second.second = max;
        return output;
    }

    public static boolean checkBst(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftmax = maximum(root.left);
        int rightmin = minimum(root.right);
        if (leftmax >= root.data) {
            return false;
        }
        if (rightmin < root.data) {
            return false;
        }
        return checkBst(root.left) && checkBst(root.right);
    }

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }
}
