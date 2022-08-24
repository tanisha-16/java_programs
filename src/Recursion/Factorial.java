/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Lenovo
 */
public class Factorial {
	
	public static int fact(int n){
		
		if(n == 0){
			return 1;
		}
		
		int smallAns = fact(n - 1);
		return n * smallAns;
	}

	public static void main(String[] args) {
		
		int n = 5;
		int ans = fact(n);
		System.out.println(ans);
		
	}

}