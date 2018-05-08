package com.test;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		System.out.println(set);
		
		for (String string : set) {
			System.out.println(string);
		}

	}

}
