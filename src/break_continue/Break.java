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
public class Break {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
                if(j>i){
                    break;
                }
            }
            System.out.println("");
            i++;
        }
    }
}
