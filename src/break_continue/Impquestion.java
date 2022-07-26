/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int pre = s.nextInt();//9
       int i = 1;
       boolean isDec = true;
       int a = 0;      //0 1  2 3
       if(n<=0||n==1) {//3 1 2 3
           a=1;
       }
       while(i<n) {
           int current = s.nextInt();//8
           if(pre == current) {
               a=1;
           }
           else if(pre>current) {//7 5
               if(isDec) {
                   pre = current;
               }else {
                   a=1;
               }
           }else if(pre<current) {
               isDec = false;
               pre = current;
           }
           i++;
       }
       if(a==0) {
           System.out.print("true");
       }else {
           System.out.print("false");
       }

	}
}
// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int prev=sc.nextInt();
//       int count=2, current;
//       boolean isdec=true;
//       while(count<=num){
//         current=sc.nextInt();
//       count++;
//       if(current==prev)
//       {
//           System.out.println("false");
//       return;
//       }
//       if(current<prev){
//           if(isdec==false){
//           System.out.println("false");
//           return;
//       }}
//       else{
//       if(isdec==true){
//       isdec=false;
//       }
//       }
//       prev=current;
//     }
//         System.out.println("true");
// }
// }


