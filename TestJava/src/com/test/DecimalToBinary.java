package com.test;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertToBinary(7);
	}
	
	public static void convertToBinary(int a) {
		if(a>0) {
			convertToBinary(a/2);
			System.out.print(a%2);
		}
	}
	

}
