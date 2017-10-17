package com.nts.designpattern.factory.abstraction;

import com.nts.designpattern.factory.abstraction.model.pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);

}
