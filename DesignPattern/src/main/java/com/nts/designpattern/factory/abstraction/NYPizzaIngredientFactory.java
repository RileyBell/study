package com.nts.designpattern.factory.abstraction;

import com.nts.designpattern.factory.abstraction.model.cheese.Cheese;
import com.nts.designpattern.factory.abstraction.model.clams.Clams;
import com.nts.designpattern.factory.abstraction.model.dough.Dough;
import com.nts.designpattern.factory.abstraction.model.perpperoni.Pepperoni;
import com.nts.designpattern.factory.abstraction.model.sauce.Sauce;
import com.nts.designpattern.factory.abstraction.model.veggies.Veggies;
import com.nts.designpattern.factory.abstraction.model.cheese.ReggianoCheese;
import com.nts.designpattern.factory.abstraction.model.clams.FreshClams;
import com.nts.designpattern.factory.abstraction.model.dough.ThinCrustDough;
import com.nts.designpattern.factory.abstraction.model.perpperoni.SlicedPepperoni;
import com.nts.designpattern.factory.abstraction.model.sauce.MarinaraSauce;
import com.nts.designpattern.factory.abstraction.model.veggies.Garlic;
import com.nts.designpattern.factory.abstraction.model.veggies.Mushroom;
import com.nts.designpattern.factory.abstraction.model.veggies.Onion;
import com.nts.designpattern.factory.abstraction.model.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
