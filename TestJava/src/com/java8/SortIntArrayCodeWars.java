package com.java8;

import java.util.Arrays;

public class SortIntArrayCodeWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 3, 2, 8, 1, 4};
		array = sortArray(array);
		
		Arrays.stream(array).forEach(System.out::println);

	}
	
	public static int[] sortArray(final int[] array) {

	    // Sort the odd numbers only
	    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
	    
	    // Then merge them back into original array
	    for (int j = 0, s = 0; j < array.length; j++) {
	      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
	    }
	    
	    return array;
	  }
	  
	}
