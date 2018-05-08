package com.algorithm.linkedlist;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.DoubleToLongFunction;

import com.comparator.Employee;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertNode(10);
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);
		list.insertNode(50);
		
		Comparator c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Employee e = new Employee(1,"Srini",32,5000);
		Employee e1 = new Employee(2,"Srinivas",32,5000);
		Employee e2= new Employee(3,"Wasim",32,5000);
		
		Map<Integer, Employee> map= new HashMap();
		map.put(e2.getId(), e2);
		map.put(e.getId(), e);
		map.put(e1.getId(), e1);
		
		TreeMap treeMap = new TreeMap(new Comparator<Entry<Integer,Employee>>() {

			@Override
			public int compare(Entry<Integer,Employee> o1, Entry<Integer,Employee> o2) {
				// TODO Auto-generated method stub
				return ((Employee)o1.getValue()).getName().compareTo(((Employee)o2.getValue()).getName());
			}
			
		});
		
		treeMap.putAll(map);
		
		Set<Entry<String, Employee>> set = treeMap.entrySet();
		for(Entry<String, Employee> entry : set){
			System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
		}
		
		
	}
}
