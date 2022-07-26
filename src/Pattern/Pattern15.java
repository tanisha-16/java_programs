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
public class Pattern15 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int p=0;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(i+j-1);
                j++;
            }
            j=1;
            
            while(j<=i-1){
                System.out.print(i-j+p);
                j++;
            }
            System.out.println();
            i++;
            p++;
        }
		
	}

}