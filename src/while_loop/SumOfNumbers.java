/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_loop;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
class SumOfNNumbers {
    public static void main(String args[]) {
     
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int i=1;// Next num to be added
      int sum=0;
      while(i<=n){
          sum=sum+i;
          i=i+1;
      }
      System.out.println(sum);

    }
}
