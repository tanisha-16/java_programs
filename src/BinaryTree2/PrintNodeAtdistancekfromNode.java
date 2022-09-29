/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PrintNodeAtdistancekfromNode {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        int n=print(root,k,node);
    }
    public static int print(BinaryTreeNode<Integer> root,int k,int elem){
        if(root==null){
            return -1;
        }
        if(root.data==elem){
            printNodesAtDepthk(root, k);
            return 0;
        }
        int ld=print(root.left,k,elem);
        int rd;
        if(ld==-1){
            rd=print(root.right, k, elem);
            if(rd==-1){
                return -1;
            }else if(rd+1==k){
                System.out.println(root.data);
                return k;
            }else{
                printNodesAtDepthk(root.left, k-rd-2);
                return rd+1;
            }
        }else if(ld+1==k){
            System.out.println(root.data);
            return k;
        }else{
            printNodesAtDepthk(root.right, k-ld-2);
            return ld+1;
        }
        
    }
    public static void printNodesAtDepthk(BinaryTreeNode<Integer> root, int dept){
        if(root==null){
            return;
        }
        if(dept==0){
            System.out.println(root.data);
            return;
        }
        printNodesAtDepthk(root.left, dept-1);
        printNodesAtDepthk(root.right, dept-1);
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
        nodesAtDistanceK(root, 5, 2);
    }
}
