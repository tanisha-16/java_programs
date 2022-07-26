/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise_operators;

/**
 *
 * @author Lenovo
 */
public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++);
		a++;
		++a;
		System.out.println(a);
		
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		a = 4;
		a *= 2;
		System.out.println(a);
		
		a ^= 2;
		System.out.println(a);
	
		int ans2 = 2 + 3 * 4;
		System.out.println(ans2);
		int ans = (2 * 3)/2;
		System.out.println(ans);
		
	}

}
