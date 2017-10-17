package com.nts.designpattern.factory.subclass;


import com.nts.designpattern.factory.subclass.model.NYStyleCheesePizza;
import com.nts.designpattern.factory.subclass.model.NYStyleClamPizza;
import com.nts.designpattern.factory.subclass.model.NYStylePepperoniPizza;
import com.nts.designpattern.factory.subclass.model.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	public com.nts.designpattern.factory.Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			return null;
		}
	}
}
