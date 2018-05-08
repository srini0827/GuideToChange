package com.innerclass.nestedclass;

public class NestedClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		
		innerClass.display();

	}

}
