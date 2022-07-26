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
public class Pattern11 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(i<n){
            int j=0;
            while(j<=i){
                System.out.print((char)('A'+n-i+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}

/*
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
