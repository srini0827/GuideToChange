package com.test;

public class AppleOnline {

	public static void main(String[] args) {
		System.out.println(multiplyOf(14));
	}
	
	public static String multiplyOf(int a) {
		
		
		if(a%3 == 0) {
			return "apple";
		} else if(a%5 == 0) {
			return "online";
		}
		
		return "appleonline";
	}

}
