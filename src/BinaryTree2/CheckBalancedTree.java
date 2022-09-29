/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CheckBalancedTree {

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    

    public static BalancedTreeReturn checkbalance_opt(BinaryTreeNode<Integer> root){
        if(root==null){
            int height=0;
            boolean isbalance=true;
            BalancedTreeReturn obj=new BalancedTreeReturn();
            obj.height=height;
            obj.isbalance=isbalance;
            return obj;
        }
        BalancedTreeReturn treeleft=checkbalance_opt(root.left);
        BalancedTreeReturn treeright=checkbalance_opt(root.right);
        boolean isbalance=true;
        int height=1+Math.max(treeleft.height, treeright.height);
        if(Math.abs(treeleft.height-treeright.height)>1){
            isbalance=false;
        }
        if(!treeleft.isbalance||!treeright.isbalance){
            isbalance=false;
        }
        BalancedTreeReturn result=new BalancedTreeReturn();
        result.height=height;
        result.isbalance=isbalance;
        return result;
    }
    
    public static boolean checkbalance(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        
        if (Math.abs(leftheight - rightheight) > 1) {
            return false;
        }
        boolean isleftbalance = checkbalance(root.left);
        boolean isrightbalance = checkbalance(root.right);
        return isleftbalance && isrightbalance;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> front = q.poll();
            
            System.out.print(front.data);
            
            if (front.left != null) {
                q.add(front.left);
                System.out.print(":L:" + front.left.data);
            } else {
                System.out.print(":L:-1");
            }
            if (front.right != null) {
                q.add(front.right);
                System.out.print(",R:" + front.right.data);
            } else {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
    }

    public static BinaryTreeNode<Integer> input() {
        Scanner s = new Scanner(System.in);
        int data;
        System.out.println("Enter the root data");
        data = s.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = q.poll();
            System.out.println("Enter data for left child of: " + frontNode.data);
            int l = s.nextInt();
            if (l != -1) {
                BinaryTreeNode<Integer> lc = new BinaryTreeNode<>(l);
                frontNode.left = lc;
                q.add(lc);
            }
            System.out.println("Enter data for Right child of: " + frontNode.data);
            int r = s.nextInt();
            if (r != -1) {
                BinaryTreeNode<Integer> rc = new BinaryTreeNode<>(r);
                frontNode.right = rc;
                q.add(rc);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = input();
        System.out.println(checkbalance(root));
        System.out.println(checkbalance_opt(root).isbalance);
    }
}
