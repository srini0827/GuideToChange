package com.test;

import java.util.Scanner;

public class PowerFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base and exponent");
		double base = scanner.nextDouble();
		int exp = scanner.nextInt();
		System.out.println(power(base, exp));
		scanner.close();
	}

	private static double power(double base, int exp) {		
		double y; 
		if(exp == 0) {
			return 1.0;
		}
		y = power(base, exp/2);
		y = y * y;
		if(exp%2 == 0) {
			return y;
		}
		return base * y;
	}
}
