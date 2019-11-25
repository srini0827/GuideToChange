package com.test;

public class ExceptionInFinally {

	public static void main(String[] args) {
		
			throwException();	
		
		

	}
	
	
	private static void throwException() {
		try {
			throw new Exception();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			int a = 1/0;
			System.out.println(a);
		}
	}

}
