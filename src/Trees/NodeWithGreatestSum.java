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
public class NodeWithGreatestSum {
    
    public static int maxSum(TreeNode<Integer> root) {
        int max=root.data;
        
        for(int i=0;i<root.children.size();i++){
            max+=root.children.get(i).data;
            
        }
        return max;
    }
    
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        int max=sum(root);
        TreeNode<Integer> maxNode=root;
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=maxSumNode(root.children.get(i));
            int childmax=sum(temp);
            if(childmax>max){
                max=childmax;
                maxNode=temp;
            }
        }
        return maxNode;
    }
    
	public static int sum(TreeNode<Integer> root) {
        int max=root.data;
        for(int i=0;i<root.children.size();i++){
            max+=root.children.get(i).data;
        }
        return max;
    }
	public static TreeNode<Integer> maxSumNode1(TreeNode<Integer> root){
		// Write your code here
        
        int max=sum(root);
        TreeNode<Integer> result=root;
        for(int i=0;i<root.children.size();i++){
           	TreeNode<Integer> temp=maxSumNode1(root.children.get(i));
            int temps=sum(temp);
            if(temps>max){
                max=temps;
                result=temp;
            }
        }
        return result;
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
        TreeNode<Integer> root=takeinputlevelwise();
        root=maxSumNode(root);
        System.out.println(root.data);
    }
}
