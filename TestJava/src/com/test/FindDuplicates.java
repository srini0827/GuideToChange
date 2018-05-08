package com.test;

import java.util.HashMap;

public class FindDuplicates {

	public static void main(String[] args) {
		String str = "Find duplicates";
		char[] chars = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : chars) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
