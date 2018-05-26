package com.java8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumber(100);
	}


	private static void primeNumber(int number) {

		IntPredicate isPrime = n -> {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};

		IntStream.range(2, 100).filter(isPrime).forEach(System.out::println);
	}

}
