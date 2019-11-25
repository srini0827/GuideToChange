package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.Node;

public class ForEach {

	public static void main(String[] args) {
		List<Node> nodes = new ArrayList<>();
		
		Node node1 = new Node("test1", null);
		Node node2 = new Node("test2", null);
		Node node3 = new Node("test3", null);
		Node node4 = new Node("test4", null);
		Node node5 = new Node("test5", null);
		Node node6 = new Node("test6", null);
		nodes.add(node1);
		nodes.add(node4);
		nodes.add(node5);
		nodes.add(node6);
		nodes.add(node2);
		nodes.add(node3);	
		iterateList(nodes);
	}
	
	
	private static void iterateList(List<Node> nodes) {
		
		for(Node node : nodes) {
			if(node.getName().equalsIgnoreCase("test1")) {
				
			}
		}
		
		nodes.forEach(node -> System.out.println(""));
		nodes.stream().filter(node -> node.getName().equalsIgnoreCase("test1"));
		nodes.forEach(node -> System.out.println(node.getName()));
			
		Collections.sort(nodes, (Node node1, Node node2) -> node1.getName().compareTo(node2.getName()));
		nodes.forEach(node -> System.out.println(node.getName()));
	/*
		Node[] nodeArray =   nodes.toArray(new Node[nodes.size()]);
		
		Arrays.sort(nodeArray,(node1, node2) -> node1.getName().compareTo(node2.getName()));
		
		nodes.forEach(node -> System.out.println(node.getName()));
		*/
	}

}
