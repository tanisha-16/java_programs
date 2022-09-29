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
public class PrintElementsinRange {

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data > k1) {
            elementsInRangeK1K2(root.left, k1, k2);
        }
        if (root.data <= k2 && root.data >= k1) {
            System.out.print(root.data + " ");
        }
        elementsInRangeK1K2(root.right, k1, k2);
    }
}
