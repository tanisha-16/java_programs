/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Takeinputlevelwise {
    public static void printlevelwise(TreeNode<Integer> root) {
        QueueLinkedList<TreeNode<Integer>> r = new QueueLinkedList<>();
        r.enqueue(root);
        while (!r.isEmpty()) {
            TreeNode<Integer> frontNode = r.dequeue();
            System.out.print(frontNode.data + " : ");
            for (int i = 0; i < frontNode.children.size(); i++) {
                System.out.print(frontNode.children.get(i).data + " ");
                r.enqueue(frontNode.children.get(i));
            }
            System.out.println();
        }

    }

    public static void printlevelwise_opt(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        QueueLinkedList<TreeNode<Integer>> r = new QueueLinkedList<>();
        r.enqueue(root);
        while (!r.isEmpty()) {
            int qsize = r.size();
            while (qsize > 0) {
                TreeNode<Integer> node = r.dequeue();
                System.out.print(node.data + " ");
                for (int i = 0; i < node.children.size(); i++) {
                    r.enqueue(node.children.get(i));
                }
                qsize--;
            }
            System.out.println();
        }

    }

    public static TreeNode<Integer> takeinputlevelwise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data");
        int rootdata = s.nextInt();
        QueueLinkedList<TreeNode<Integer>> pendingnodes = new QueueLinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootdata);
        pendingnodes.enqueue(root);
        while (!pendingnodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingnodes.dequeue();
            System.out.println("Enter no. of children for node " + frontNode.data);
            int noofchildren = s.nextInt();
            for (int i = 0; i < noofchildren; i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingnodes.enqueue(childNode);
            }
        }
        return root;
    }
}
