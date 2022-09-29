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
public class Takeinputlevelwise {
    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String res=root.data+" : ";
        if(root.left!=null){
            res+=root.left.data+", ";
        }
        if(root.left!=null){
            res+=root.right.data+", ";
        }
        System.out.println(res);
        print(root.left);
        print(root.right);
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> front=q.poll();
            
            System.out.print(front.data);
    
            if(front.left!=null){
                q.add(front.left);
                System.out.print(":L:"+front.left.data);
            }else{
                System.out.print(":L:-1");
            }
            if(front.right!=null){
                q.add(front.right);
                System.out.print(",R:"+front.right.data);
            }else{
                 System.out.print(",R:-1");
            }
            System.out.println();
        }
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
        BinaryTreeNode<Integer> tree=input();
        printLevelWise(tree);
    }
}
