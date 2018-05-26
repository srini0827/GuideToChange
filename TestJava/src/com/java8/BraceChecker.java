package com.java8;

import java.util.Stack;

public class BraceChecker {

	public static void main(String[] args) {
		System.out.println(braceChecker("{(){}[]}"));

	}
	
	public static boolean braceChecker(String str) {
		boolean result = true;
		char[] cArray = str.toCharArray();
		Stack<Character> stack = new Stack<>();
			
		char t;
		for(char c : cArray) {
			
			switch(c) {
			case '}':
				t =stack.pop();
				if(t != '{') {
					result = false;
				}
				break;
			case ']':
				t =stack.pop();
				if(t != '[') {
					result = false;
				}
				break;
			case ')':
				t =stack.pop();
				if(t != '(') {
					result = false;
				}
				break;
			default:
				stack.push(c);
			}			
		}
		
		if(!stack.isEmpty()) {
			result = false;
		}
		
		
		return result;
	}

}
