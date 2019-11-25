package com.innerclass.annonymousclass;

public class AnnoymousDemo {

	public static void main(String args[]) {
		int sum = 100;
		AbstractAnnoymous abstractAnnoymous = new AbstractAnnoymous() {
			
			@Override
			public void display() {
				
				System.out.println("Print --> " + sum);
			}
		};
		
		abstractAnnoymous.display();
	}
}
