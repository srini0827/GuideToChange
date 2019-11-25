package com.java8;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class TrippleDouble {

	public static void main(String[] args) {
		System.out.println(TripleDouble(123335, 233354));

	}

	public static int TripleDouble(long num1, long num2) 
	{
		String num1Str = String.valueOf(num1);
		String num2Str = String.valueOf(num2);
		Predicate<String> predicate = i -> (num1Str.contains(i+i+i)) && (num2Str.contains(i+i+i) || num2Str.contains(i+i));
		boolean flag = IntStream.rangeClosed(0, 9).mapToObj(i -> Integer.toString(i)).anyMatch(predicate);
		
		if(flag) {
			return 1;
		}
				
		return 0;
	}

}
