package com.test;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates1 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,7,1,3,2,8,9,7};		
		findDuplicates(arr);
	}

	private static void findDuplicates(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for(int i : arr) {
			if(!set.add(i)) {
				System.out.print(i + " ");
			}
		}		
	}
}
