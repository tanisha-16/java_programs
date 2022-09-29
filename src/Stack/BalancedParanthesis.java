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
class StackArray {

    private char[] data;
    private int top;

    public StackArray() {
        data = new char[10];
        top = -1;
    }

    public StackArray(int capacity) {
        data = new char[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public char top() {
        if (size() == 0) {
            return (char)(-1);
        }
        return data[top];
    }

    public void push(char ele){
        if (size() == data.length) {
            doubleCapacity();
        }
        top++;
        data[top] = ele;
    }
    
    public char pop() {
        if (size() == 0) {
            return (char)(-1);
        }
        char temp = data[top];
        top--;
        return temp;
    }

    private void doubleCapacity() {
        char[] temp=data;
        data=new char[temp.length*2];
        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
    }
}
public class BalancedParanthesis {
    public static boolean isBalanced(String str){
        //Your code goes here
        StackArray stack=new StackArray();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                if(stack.top()=='('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }
    public static void main(String[] args){
        String s="(((()())))";
        System.out.println(isBalanced(s));
    }
}
