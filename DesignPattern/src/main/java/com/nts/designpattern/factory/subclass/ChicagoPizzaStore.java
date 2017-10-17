package com.nts.designpattern.factory.subclass;

import com.nts.designpattern.factory.Pizza;
import com.nts.designpattern.factory.subclass.model.ChicagoStyleCheesePizza;
import com.nts.designpattern.factory.subclass.model.ChicagoStyleClamPizza;
import com.nts.designpattern.factory.subclass.model.ChicagoStylePepperoniPizza;
import com.nts.designpattern.factory.subclass.model.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else {
			return null;
		}
	}
}
