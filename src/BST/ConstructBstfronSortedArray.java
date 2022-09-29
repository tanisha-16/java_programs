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
public class ConstructBstfronSortedArray {

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
        return SortedArrayToBST(arr, 0, n - 1);
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start <= end) {
            BinaryTreeNode<Integer> res = new BinaryTreeNode<>(arr[mid]);
            res.left = SortedArrayToBST(arr, start, mid - 1);
            res.right = SortedArrayToBST(arr, mid + 1, end);
            return res;
        } else {
            return null;
        }
    }

}
