/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LargestElement {
    public static int largest(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int maxleft=largest(root.left);
        int maxright=largest(root.right);
        return Math.max(root.data, Math.max(maxleft, maxright));
    }
    public static BinaryTreeNode<Integer> input(){
        Scanner s=new Scanner(System.in);
        int data;
        System.out.println("Enter the root data");
        data=s.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> frontNode=q.poll();
            System.out.println("Enter data for left child of: "+frontNode.data);
            int l=s.nextInt();
            if(l!=-1){
                BinaryTreeNode<Integer> lc=new BinaryTreeNode<>(l);
                frontNode.left=lc;
                q.add(lc);
            }
            System.out.println("Enter data for Right child of: "+frontNode.data);
            int r=s.nextInt();
            if(r!=-1){
                BinaryTreeNode<Integer> rc=new BinaryTreeNode<>(r);
                frontNode.right=rc;
                q.add(rc);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        
        BinaryTreeNode<Integer> root=input();
        System.out.println(largest(root));
    }
}
