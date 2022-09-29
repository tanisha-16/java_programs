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
public class FindNoofNodes {
    public static int count(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int c=1;
        for(int i=0;i<root.children.size();i++){
            c+=count(root.children.get(i));
        }
        return c;
    }
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
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TreeNode<Integer> n=takeinput(s);
        System.out.println(count(n));
    }
}
