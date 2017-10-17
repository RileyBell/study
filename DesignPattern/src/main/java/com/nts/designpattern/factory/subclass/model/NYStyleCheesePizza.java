package com.nts.designpattern.factory.subclass.model;

import com.nts.designpattern.factory.Pizza;

public class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza() {
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");

		getToppings().add("Grated Reggiano Cheese");
	}
}
