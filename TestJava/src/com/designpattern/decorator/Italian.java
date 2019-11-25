package com.designpattern.decorator;

public class Italian extends Pizza {

	public Italian(String description) {
		this.description = description  + " - Italian: ";
	}

	@Override
	public double cost() {
		return 1.20;
	}
}
