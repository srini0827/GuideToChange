package com.test;

public class ReverseLinkedList {

	public static void main(String args[]) {
		Node node1 = new Node("Wasim", null);
		Node node2 = new Node("Ridha", null);
		Node node3 = new Node("Laheera", null);
		Node node4 = new Node("Arafath", null);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		reverseList(node1);
	}

	private static void reverseList(Node node) {
		if(node != null) {
			reverseList(node.next);
			System.out.print(node.name + " ");
		}
	}
	
	
}
