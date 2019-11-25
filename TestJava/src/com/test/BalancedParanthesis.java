package com.test;

public class BalancedParanthesis {

	public static void main(String[] args) {
		boolean flag = check("{}(){}[]");
		
		if(flag) {
			System.out.println("Balanced");
		} else {
			System.out.println("not Balanced");
		}

	}

	public static boolean check(String s) {		
	    int openParanthesisCounter = 0;
	    int closeParanthesisCounter = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
	        	openParanthesisCounter++;
	        } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
	            
	        	closeParanthesisCounter++;
	        }
	    }
	    return closeParanthesisCounter == openParanthesisCounter;
	}
}
