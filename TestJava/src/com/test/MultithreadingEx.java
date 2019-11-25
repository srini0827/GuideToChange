package com.test;

public class MultithreadingEx implements Runnable{

	public static void main(String[] args) {
		MultithreadingEx multithreadingEx = new MultithreadingEx();
		for(int i = 0 ; i < 10; i ++) {
			Thread thread = new Thread(multithreadingEx);			
			thread.start();
		}
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
