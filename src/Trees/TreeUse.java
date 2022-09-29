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
public class TreeUse {

    public static TreeNode<Integer> takeinput(Scanner s) {

        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        int childcount = s.nextInt();
        for (int i = 0; i < childcount; i++) {
            TreeNode<Integer> child = takeinput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

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
            System.out.println("Enter no. of children for node" + frontNode.data);
            int noofchildren = s.nextInt();
            for (int i = 0; i < noofchildren; i++) {
                System.out.println("Enter" + (i + 1) + "th child of" + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingnodes.enqueue(childNode);
            }
        }
        return root;
    }

    public static void main(String[] args) {
//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node3.children.add(node4);
//        Scanner s = new Scanner(System.in); // we have to declare Scanner here so we can take input of tree in a single line
//        TreeNode<Integer> root1 = takeinput(s);
        TreeNode<Integer> root1 = takeinputlevelwise();
        //print(root1);
        printlevelwise_opt(root1);
    }
}
