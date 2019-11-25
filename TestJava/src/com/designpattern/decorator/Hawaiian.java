package com.designpattern.decorator;

public class Hawaiian extends Pizza {

	public Hawaiian(String description) {
		this.description = description  + "- Hawaiian:";
	}

	@Override
	public double cost() {
		return 2.20;
	}
}
