package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testing {

	public static void main(String args[]) {
		Map<String, Map<String, List<String>>> map = new HashMap<>();
		Map<String, List<String>> map1 = new HashMap<>();
		List<String> string1s = new ArrayList<>();
		string1s.add("test1");
		string1s.add("test2");
		map1.put("inner1", string1s);
		
		List<String> string2s = new ArrayList<>();
		string2s.add("test3");
		string2s.add("test4");
		map1.put("inner2", string2s);
		
		map.put("outer", map1);
		System.out.println(map.get("outer").values());
	}
}
