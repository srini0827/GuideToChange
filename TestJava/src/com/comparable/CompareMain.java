package com.comparable;

import java.util.Arrays;

public class CompareMain {

	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[3];
		fruits[0] = new Fruit("Saffron", "small", 12.01);
		
		fruits[1] = new Fruit("Avacado", "medium", 15.01);
		
		fruits[2] = new Fruit("Watermelon", "large", 10.01);
		
		
		Arrays.sort(fruits);
		System.out.println("Comparator - " + Arrays.toString(fruits));
		
		
		Arrays.sort(fruits, Fruit.priceComparator);
		System.out.println("Price comparator output - " + Arrays.toString(fruits));
		
		Arrays.sort(fruits, Fruit.sizeComparator);
		System.out.println("Size comparator output" + Arrays.toString(fruits));
		
	}
}
