package com.test;

public class Fibanocci {

	public static void main(String[] args) {
		
		for(int j = 0 ; j <=10 ; j++)
			System.out.println(fibonacci(j));

	}


	public static long fibonacci(long i) {
		if(i <= 1) {
			return i;
		} else {	
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}

}
