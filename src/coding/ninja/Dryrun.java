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
public class Dryrun {
    public static void main(String[] args) {
        int n=5;
    int a=0,b=1,sum=0;
        while(sum<=n){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(a);
    }
    
}
