package com.java8;

public class FunctionInterfaceMain {

	public static void main(String[] args) {
		FunctionalInterface fi = (a, b) -> {
			System.out.println(a+b);
		};

		fi.add(10, 10);
	}

}
