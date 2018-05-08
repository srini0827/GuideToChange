package com.java8;

public class LambdatTest {
	

	public static void main(String ar[]){
		
		//traditional way of anonymous class
		/*
		 * 	doSomething( new DoStuff(){
		 * 		
		 * 	public int add(int a, int b){
		 * 		return a+b;
		 *  }
		 * });

		 */
		
		//using lambda expression
		doSomething( (s,t) -> {return s+t;});
		
	}

	private static void doSomething(DoStuff doStuff) {
		System.out.println(doStuff.add(2,3));
	}
	
}
