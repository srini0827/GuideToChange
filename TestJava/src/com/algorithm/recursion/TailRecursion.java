package com.algorithm.recursion;

public class TailRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(5, 1));
	}

	private static int factorial(int i, int j) {
		if(i == 0) return j;
		
		return factorial(i-1, i * j);
	}
}
