/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Lenovo
 */
public class StackUseLL {
    public static void main(String[] args) {
        StackUsingLL<Integer> stack=new StackUsingLL<>();
        System.out.println(stack.isEmpty());
        for(int i=0;i<3;i++){
            stack.push(i);
        }
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.top()+" "+stack.isEmpty()+" "+stack.size());
    }
    
}
