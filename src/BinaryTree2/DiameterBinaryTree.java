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
public class DiameterBinaryTree {
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int diam=height(root.left)+height(root.right);
        int ldiam=diameter(root.left);
        int rdiam=diameter(root.right);
        return Math.max(diam, Math.max(ldiam, rdiam));
    }
    public static Pair<Integer> diameter_opt(BinaryTreeNode<Integer> root){
        if(root==null){
            int height=0;
            int diameter=0;
            Pair<Integer> res=new Pair<>();
            res.height=height;
            res.diameter=diameter;
            return res;
        }
        Pair<Integer> lo=diameter_opt(root.left);
        Pair<Integer> ro=diameter_opt(root.right);
        int height=1+Math.max(lo.height, ro.height);
        int option1=lo.height+ro.height;
        int option2=lo.diameter;
        int option3=ro.diameter;
        int diam=Math.max(option1, Math.max(option2, option3));
        Pair<Integer> result=new Pair<>();
        result.height=height;
        result.diameter=diam;
        return result;
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
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
        BinaryTreeNode<Integer> root=input();
        System.out.println(diameter(root));
        System.out.println(diameter_opt(root).diameter+" "+diameter_opt(root).height);
    }
}
