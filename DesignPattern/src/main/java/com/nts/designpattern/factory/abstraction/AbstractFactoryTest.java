package com.nts.designpattern.factory.abstraction;

import com.nts.designpattern.factory.abstraction.model.pizza.Pizza;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();

		Pizza pizza = nyPizzaStore.orderPizza("cheese");


	}
}
