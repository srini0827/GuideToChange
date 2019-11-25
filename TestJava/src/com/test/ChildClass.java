package com.test;

public class ChildClass extends BaseClass{

	public void getObject() {
		SingletonEnum sEnum = SingletonEnum.INSTANCE;
		System.out.println(sEnum.add(10, 20));
	}
	
	public static void main(String agrs[]) {
		ChildClass childClass = new ChildClass();
		childClass.getObject();
	}
	
}
