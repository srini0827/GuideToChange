package com.algorithm.linkedlist;

public class Node {

	private Node nextNode;
	
	private int value;
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return String.valueOf("Data : " +value);
	}
}
