/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BinaryTreeuse {
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String res=root.data+" :";
        if(root.left!=null){
            res+="L:"+root.left.data+",";
        }
        if(root.right!=null){
            res+="R:"+root.right.data;
        }
        System.out.println(res);
        printTree(root.left);
        printTree(root.right);
    }
    public static BinaryTreeNode<Integer> takeinput(Scanner s){
        int data;
        System.out.println("Enter root data");
        data=s.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(data);
        root.left=takeinput(s);
        root.right=takeinput(s);
        return root;
        
    }
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(10);
//        BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(20);
//        BinaryTreeNode<Integer> node3=new BinaryTreeNode<>(30);
//        BinaryTreeNode<Integer> node4=new BinaryTreeNode<>(40);
//        node1.left=node2;
//        node1.right=node3;
//        node2.left=node4;
        
        Scanner s=new Scanner(System.in);
        BinaryTreeNode<Integer> bt=takeinput(s);
        printTree(bt);
    }
}
