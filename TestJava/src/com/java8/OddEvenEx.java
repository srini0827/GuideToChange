package com.java8;

import java.util.Optional;

public class OddEvenEx {


	public static void main(String[] args) {
		IOddEven iOddEven = (n) -> {
			if(n%2 == 0) {
				return "Hello " + n;
			}
			return null;
		};
		
		Optional<String> optional = Optional.ofNullable(iOddEven.oddEven(10));
				
		System.out.println(optional);

	}

}
