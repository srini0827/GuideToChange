package com.algorithm.linkedlist;

//LIFO
public class LinkedList {
	private Node head;
	
	public Node getHead() {
		return this.head;
	}
	
	public void setNode(Node node) {
		this.head = node;
	}
	
	public void insertNode(int data) {
		Node newNode = new Node();
		newNode.setValue(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
		
	}
	
	@Override
	public String toString() {
		String res = "";
		Node curr = this.head;
		while (curr != null) {
			res += curr + ", ";
			curr = curr.getNextNode();
		}
		return res;
	}
}
