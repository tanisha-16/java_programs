/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Lenovo
 */
public class HeightofTree {
    public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int temp=0,height=0;
        if(root==null){
            return 0;
        }
        
        if(root.children.isEmpty()){
            return 1;
        }
        for(int i=0;i<root.children.size();i++){
            temp=getHeight(root.children.get(i));
            if(temp>height){
                height=temp;
            }
        }
        return height+1;
	}
}
