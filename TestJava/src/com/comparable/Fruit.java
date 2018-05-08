package com.comparable;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{

	private String name;
	private String size;
	private double price;

	public String getName() {
		return this.name;
	}

	public String getSize() {
		return this.size;
	}

	public double getPrice() {
		return this.price;
	}

	public Fruit(String name, String size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit o) {
		double price = this.price - o.price; 
		if(price == 0) {
			return this.size.compareTo(o.size);
		}
		return (int)price;
	}

	public static Comparator<Fruit> priceComparator = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit o1, Fruit o2) {		
			return (int)(o1.price - o2.price);
		}
	};

	public static Comparator<Fruit> sizeComparator = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit o1, Fruit o2) {        	
			return o1.size.compareTo(o2.size);            
		}
	};

	@Override
	public String toString() {
		return "[" + "name:" + this.name + ", size:"+ this.size + ", price:" + this.price + "]";
	}
}
