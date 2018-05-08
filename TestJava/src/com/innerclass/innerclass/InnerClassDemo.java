package com.innerclass.innerclass;

public class InnerClassDemo {
	public static void main(String args[]) {
		Outerclass outerclass = new Outerclass();
		outerclass.displayInnerclass();
	}
}

class Outerclass {
	int sum;
	private class Innerclass {
		public void print() {
			System.out.println("Print inner class Sum - " + sum);
		}
	}

	public void displayInnerclass() {
		Innerclass innerclass = new Innerclass();
		innerclass.print();
	}
}

