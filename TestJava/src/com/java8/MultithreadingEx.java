package com.java8;

public class MultithreadingEx {

	public static void main(String args[]) {
		try {
			Runnable runnable = () -> {
				System.out.println("run thread 1");
			};
			
			
			runnable.run();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
