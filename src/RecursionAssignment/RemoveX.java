/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionAssignment;

/**
 *
 * @author Lenovo
 */
public class RemoveX {
    
    public static String removeX_1(String str){
		
		if(str.length() == 0){
			return str;
		}
		String ans = "";
		if(str.charAt(0) != 'x'){
			ans = ans + str.charAt(0);
		}
		
		String smallAns = removeX(str.substring(1));
		return ans + smallAns;
		
	}
    public static String removeX(String input) {
        // Write your code here
        if(input.length()<1){
            return input;
        }
        if(input.charAt(0)=='x'){
            return removeX(input.substring(1));
        }else{
            return input.charAt(0)+removeX(input.substring(1));
        }

    }
    public static void main(String[] args) {
        System.out.println(removeX("xx"));
        System.out.println(removeX_1("aaxvxvcb"));
    }
}
