package com.designpattern.decorator;

public class Onion extends ToppingDecorator {

	Pizza pizza;

	public Onion(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Onion";
	}

	@Override
	public double cost() {
		return 0.55 + pizza.cost();
	}

}
