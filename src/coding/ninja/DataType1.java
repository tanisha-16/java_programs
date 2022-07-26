/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.ninja;

/**
 *
 * @author Lenovo
 */
public class DataType1 {

	public static void main(String[] args) {
		char c = 'a';
		//System.out.println(c + 3);
		
		int i = c + 10;
		//System.out.println(i);
		
		i = c;
		char abc = (char)i;
		
		long l = i;
		l = 12345654321L;
		i = (int)l;
		System.out.println(l);
		System.out.println(i);
		
		double d = i;
		//i = d;
		
		float f = 1.23f;
		//f = d;
		d = f;
		
		int j = 100;
	}

}
