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
import java.util.Stack;
public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        System.out.println(stack.size());
        stack.push(20);
        stack.push(3);
        stack.pop();
        System.out.println(stack.size()+" "+stack.peek());
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.print(stack.pop()+stack.size());
    }
}
