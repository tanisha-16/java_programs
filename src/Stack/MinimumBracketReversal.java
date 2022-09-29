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
public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        if(input.length()%2!=0){
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='{'){
                stack.push('{');
            }else{
                if(stack.isEmpty()|| stack.peek()=='}'){
                    stack.push('}');
                }else{
                    stack.pop();
                }
            }
        }
        int count=0;
        while(!stack.isEmpty()){
            char c1=stack.pop();
            char c2=stack.pop();
            if(c1==c2){
                if(c2=='{'){
                    c2='}';
                }
                if(c1=='}'){
                    c1='{';
                }
                count++;
            }else{
                c1='{';
                c2='}';
                count++;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="{{{{}}";
        System.out.println(countBracketReversals(str));
    }
}
