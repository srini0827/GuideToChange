package com.test;

public class Node {

	String name;
	Node next;
	
	public String getName() {
		return name;
	}

	public Node(String name, Node next) {
		this.name = name;
		this.next = next;
	}
}
