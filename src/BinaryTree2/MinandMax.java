/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree2;

/**
 *
 * @author Lenovo
 */
class Pair1<T, U> {
		T minimum;
		U maximum;

		public Pair1(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}
public class MinandMax {
    public static Pair1<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            Pair1<Integer,Integer> res=new Pair1<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            return res;
        }
        Pair1<Integer,Integer> leftans=getMinAndMax(root.left);
        Pair1<Integer,Integer> rightans=getMinAndMax(root.right);
        int max=Math.max(root.data,Math.max(leftans.maximum,rightans.maximum));
        int min=Math.min(root.data,Math.min(leftans.minimum,rightans.minimum));
        Pair1<Integer,Integer> ans=new Pair1<>(min,max);
        return ans;
	}
}
