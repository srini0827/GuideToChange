package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortingIntArray {

	public static void main(String[] args) {
		int[] array = {5, 3, 2, 8, 1, 4};
		array = sortArray(array);
		Arrays.stream(array).forEach(System.out::println);
		System.out.println();

	}


	public static int[] sortArray(int[] array) {
			
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i = 0 ; i < array.length; i++) {
			if(array[i]%2 != 0) {
				hashMap.put(i, array[i]) ;
			}		
		}
		
		
		List<Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet()); 
		
		Collections.sort(list, (e1, e2) -> e1.getValue()-e2.getValue());
		
		int j = 0;
		int k = 0;
		for(; j < array.length;j++) {
			if(array[j]%2 != 0) {
				array[j] = list.get(k).getValue();
				k++;
			}
		}
		
		System.out.println(list.toString());
		
		

		return array;
	}

}
