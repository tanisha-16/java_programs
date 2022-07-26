/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
class Solution {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        if(n==0){
            System.out.println("*");
            System.out.println("*");
        }
        else{
        while(i<=n+1){
            int j=1;
            int k=i-2;
            while(j<=2*i-1){
                if(j==1 || j==2*i-1){
                	System.out.print("*");
                }
                else if(j>i){
                        System.out.print(k);
                    	k--;
                    }
                else{
                	System.out.print(j-1);
                    
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        i=1;
        while(i<=n){
            int j=1;
            int k=n-i-1;
            while(j<=2*(n-i+1)-1){
                if(j==1 || j==2*(n-i+1)-1){
                	System.out.print("*");
                }
                else if(j>n-i+1){
                        System.out.print(k);
                    	k--;
                    }
                else{
                	System.out.print(j-1);
                    
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        }
	}
}

/*
I/p: 5
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

I/p: 3
*
*1*
*121*
*12321*
*121*
*1*
*
*/