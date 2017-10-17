package com.nts.designpattern.factory.abstraction.model.pizza;

import com.nts.designpattern.factory.abstraction.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
	}

	public PizzaIngredientFactory getIngredientFactory() {
		return ingredientFactory;
	}

	public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
}
