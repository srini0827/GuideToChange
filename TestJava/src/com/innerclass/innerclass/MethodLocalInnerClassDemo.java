package com.innerclass.innerclass;

public class MethodLocalInnerClassDemo {

	 void display() {
		int sum = 100;
		class InnerClass {
			void print() {
				System.out.println("Print sum - " + sum);
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.print();
	}
	public static void main(String[] args) {
		MethodLocalInnerClassDemo methodLocalInnerClassDemo = new MethodLocalInnerClassDemo();
		methodLocalInnerClassDemo.display();
	}
}
