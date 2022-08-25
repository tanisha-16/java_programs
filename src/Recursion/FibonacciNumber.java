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
public class FibonacciNumber {

	public static int fib(int n){
//		System.out.println("fib " + n);
		if(n == 0 || n == 1){
			return n;
		}
		
		
		return fib(n - 1) + fib(n - 2);
		
	}
	
	
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(fib(n));
		
	}

}
