package com.test;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Key, Value> treeMap = new TreeMap<>();

	}
	
	

}

class Key {
	String key;
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
}

class Value {
	String value;
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}