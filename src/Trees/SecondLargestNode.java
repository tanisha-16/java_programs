/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Lenovo
 */
public class SecondLargestNode {
    
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
//         if(root==nullptr) return nullptr;
//     int childCount = root->children.size();
//     if(childCount==0) return nullptr;

    
//     TreeNode<int> *largest = root, *secLargest=root->children[0];
//     if(largest->data<secLargest->data)
//     {
//         secLargest = root;
//         largest=root->children[0];
//     }
//     queue<TreeNode<int>*> q;
//     q.push(root);
//     while(!q.empty())
//     {
//         TreeNode<int> *curr = q.front();
//         q.pop();
//         childCount = curr->children.size();
//         for(int i=0; i<childCount; i++)
//         {
//             q.push(curr->children[i]);
//             if(curr->children[i]->data > secLargest->data)
//             {
//                 if(curr->children[i]->data > largest->data)
//                 {
//                     secLargest = largest;
//                     largest = curr->children[i];
//                 }
//                 else
//                 {
//                     secLargest = curr->children[i];
//                 }
//             }
//         }
//     }
//     return secLargest;
        if(root==null){
            return null;
        }
		if(root.children.isEmpty()){
            return null;
        }
        
        TreeNode<Integer> max=root, secondmax=root.children.get(0);
        if(max.data<secondmax.data){
            secondmax=root;
            max=root.children.get(0);
        }
        Queue<TreeNode<Integer>> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode<Integer> curr=q.poll();
            for(int i=0;i<curr.children.size();i++){
                q.add(curr.children.get(i));
                if(curr.children.get(i).data>secondmax.data){
                    if(curr.children.get(i).data>max.data){
                        secondmax=max;
                        max=curr.children.get(i);
                    }else{
                        secondmax=curr.children.get(i);
                    }
                }
            }
        }
        return secondmax;
	}
}
