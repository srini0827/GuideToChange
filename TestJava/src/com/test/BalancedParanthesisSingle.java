package com.test;

public class BalancedParanthesisSingle {

	public static void main(String[] args) {
		boolean flag = check("{})({}[]");
		
		if(flag) {
			System.out.println("Balanced");
		} else {
			System.out.println("not Balanced");
		}

	}

	public static boolean check(String s) {		
	    int counter = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
	        	counter++;
	        } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
	            if(counter == 0) {
	            	return false;
	            }
	            counter--;
	        }
	    }
	    return counter == 0;
	}
}
