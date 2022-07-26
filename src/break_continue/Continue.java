/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_continue;

/**
 *
 * @author Lenovo
 */
public class Continue {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        while(i<=n){
            if(i==5){
                continue; //this statement goes into infinite loop
            }
            System.out.println(i);
            i++;
        }
    }
}
