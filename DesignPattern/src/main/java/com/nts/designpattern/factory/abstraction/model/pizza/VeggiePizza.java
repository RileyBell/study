package com.nts.designpattern.factory.abstraction.model.pizza;

import com.nts.designpattern.factory.abstraction.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {

	}

	public PizzaIngredientFactory getIngredientFactory() {
		return ingredientFactory;
	}

	public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
}
