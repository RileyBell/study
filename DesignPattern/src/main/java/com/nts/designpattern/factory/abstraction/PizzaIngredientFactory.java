package com.nts.designpattern.factory.abstraction;

import com.nts.designpattern.factory.abstraction.model.cheese.Cheese;
import com.nts.designpattern.factory.abstraction.model.clams.Clams;
import com.nts.designpattern.factory.abstraction.model.dough.Dough;
import com.nts.designpattern.factory.abstraction.model.perpperoni.Pepperoni;
import com.nts.designpattern.factory.abstraction.model.sauce.Sauce;
import com.nts.designpattern.factory.abstraction.model.veggies.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
	
}
