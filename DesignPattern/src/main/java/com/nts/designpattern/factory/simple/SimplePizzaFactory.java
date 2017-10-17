package com.nts.designpattern.factory.simple;

import com.nts.designpattern.factory.simple.model.CheesePizza;
import com.nts.designpattern.factory.simple.model.ClamPizza;
import com.nts.designpattern.factory.simple.model.PepperoniPizza;
import com.nts.designpattern.factory.Pizza;
import com.nts.designpattern.factory.simple.model.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
