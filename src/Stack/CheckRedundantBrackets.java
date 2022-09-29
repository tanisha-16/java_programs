/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public class CheckRedundantBrackets {

    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        int count;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) != ')') {
                stack.push(expression.charAt(i));
            } else {
                count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count <= 1) {
                    return true;
                }
                stack.pop();
            }
        }

        return false;

    }

    public static void main(String[] args) {
        String s = "((c+(a+b)))";
        System.out.println(checkRedundantBrackets(s));
    }

}
