package com.java8;

public interface FunctionalInterfaceEx {

	public int add(int a, int b);
	
	public default void display(int sum) {
		System.out.println("sum" + sum);
	}
	
	public static void show(int a, int b) {
		int sum = a + b;
		System.out.println("sum" + sum);
	}
}
