package com.designpattern.decorator;

public abstract class Pizza {
	protected String description = null;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
