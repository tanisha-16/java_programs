/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Lenovo
 */
public class Reversewordofsentence {
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    //My solution
    public static String reverseWordWise(String input) {
        // Write your code here
        int start = 0;
        String res = "";
        for (int end = 0; end < input.length(); end++) {
            if (input.charAt(end) == ' ') {

                res += reverse(input.substring(start, end)) + " ";
                start = end + 1;
            }
        }
        res += reverse(input.substring(start, input.length()));
        return res;
    }
    //Coding ninja solution
    public static String reverseEachWord(String str){
          String ans="";
          int currentWordStart=0;
          int i=0;
          for(;i<str.length();i++){
              if(str.charAt(i)==' '){
                  //Reverse Current Word
                  int currentWordEnd=i-1;
                  String reversedWord="";
                  for(int j=currentWordStart;j<=currentWordEnd;j++){
                      reversedWord=str.charAt(j)+reversedWord;
                  }
                  //Add it final String(ans)
                  ans+=reversedWord+" ";
                  currentWordStart=i+1;
              }
          }
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
      }

    public static void main(String[] args) {
        //System.out.println(reverseWordWise("Welcome To the net beans"));
        System.out.println(reverseEachWord("Welcome to the net beans"));
        System.out.println(reverseWordWise("Welcome to the net beans"));
    }
}
