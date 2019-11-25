package com.java8;

public class Student {

	int mark;
	String name;
	
	public Student(int mark, String name) {
		this.mark = mark;
		this.name = name;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{Name: " + this.name + ", Mark: " + this.mark + "}";
	}
}
