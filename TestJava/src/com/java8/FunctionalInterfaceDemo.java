package com.java8;

public class FunctionalInterfaceDemo implements FunctionalInterfaceEx{

	public static void main(String[] args) {
		FunctionalInterfaceEx functionalInterfaceEx = (a,b) -> a+b;
		int sum = functionalInterfaceEx.add(10, 20);
		
		functionalInterfaceEx.display(sum);
		
		FunctionalInterfaceDemo functionalInterfaceDemo = new FunctionalInterfaceDemo();
		sum = functionalInterfaceDemo.add(10, 40);
		functionalInterfaceDemo.display(sum);

	}

	@Override
	public int add(int a, int b) {		
		return a+b;
	}
	
	
	@Override
	public void display(int sum) {
		System.out.println("overrided display method- sum : " + sum);
	}
	

}
