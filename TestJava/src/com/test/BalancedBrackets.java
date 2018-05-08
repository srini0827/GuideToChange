package com.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String braces = "{}{}()";
        if(isBalanced(braces)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    /*checks if braces is balanced*/
    private static boolean isBalanced(String str) {
        /*stores braces*/
        Map<Character, Character> bracketPairs = new HashMap<>();
                  
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');
          
        /*in order to be balanced, there should be even number of characters*/
        if(str.length() % 2 != 0){
            return false;
        }
        /*stores opening braces in this case */
        Stack<Character> halfBraces = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            /*if characters ( bracket ) is opening, then store it into stack*/
            if(bracketPairs.containsKey(str.charAt(i))){
                halfBraces.push(str.charAt(i));
            }
            /*if closing bracket is not equal to top of stack or if stack is empty, then return false*/
            else if(halfBraces.isEmpty() || bracketPairs.get(halfBraces.pop()) != str.charAt(i)){
                return false;
            }
        }
        /*before returning true, make sure that stack is empty because if 
        stack is not empty, then in worst case like above input, it would return true*/
        return halfBraces.isEmpty() ? true : false;
    }
}