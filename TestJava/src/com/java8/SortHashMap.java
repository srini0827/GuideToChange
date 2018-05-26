package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {
		Map<String,Integer> aMap = new HashMap<String,Integer>();

		// adding keys and values
		aMap.put("Five", 5);
		aMap.put("Seven", 7);
		aMap.put("Eight", 8);
		aMap.put("One",1);
		aMap.put("Two",2);
		aMap.put("Three", 3);

		sortMapByValues(aMap);

	}

	private static void sortMapByValues(Map<String, Integer> aMap) {
		Set<Entry<String, Integer>> set = aMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		
	}

}
