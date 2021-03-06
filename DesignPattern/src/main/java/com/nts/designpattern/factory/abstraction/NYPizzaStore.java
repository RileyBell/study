package com.nts.designpattern.factory.abstraction;


import com.nts.designpattern.factory.abstraction.model.pizza.CheesePizza;
import com.nts.designpattern.factory.abstraction.model.pizza.ClamPizza;
import com.nts.designpattern.factory.abstraction.model.pizza.PepperoniPizza;
import com.nts.designpattern.factory.abstraction.model.pizza.Pizza;
import com.nts.designpattern.factory.abstraction.model.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}
