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
public class SumofallNodes {
    public static int sum(TreeNode<Integer> root){
        int s=root.data;
        for(int i=0;i<root.children.size();i++){
            //s+=root.children.get(i).data;
            s+=sum(root.children.get(i));
            
        }
        
//        for(int i=0;i<root.children.size();i++){
//            sum(root.children.get(i));
//            
//        }
        return s;
        
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
        TreeNode<Integer> node=takeinputlevelwise();
        System.out.println(sum(node));
    }
}
