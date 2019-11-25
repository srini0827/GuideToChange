package com.test;

public enum SingletonEnum {
	INSTANCE;
	
	public int add(int a, int b) {
		return a + b;
	}
}
