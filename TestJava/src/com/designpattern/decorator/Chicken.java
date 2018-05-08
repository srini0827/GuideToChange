package com.designpattern.decorator;

public class Chicken extends ToppingDecorator {

	Pizza pizza;

	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Chicken";
	}

	@Override
	public double cost() {
		return 2.25 + pizza.cost();
	}

}
