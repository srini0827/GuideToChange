package com.test;

public class ReverseString {

	public static void main(String[] args) {
		String temp = "reverse a string";
		
		byte[] tempByte = temp.getBytes();
		byte[] resultByte = new byte[tempByte.length];
		
		for(int i = 0 ; i < tempByte.length ; i++) {
			resultByte[i] = tempByte[tempByte.length - i - 1];
		}

		System.out.println(new String(resultByte));
	}

}
