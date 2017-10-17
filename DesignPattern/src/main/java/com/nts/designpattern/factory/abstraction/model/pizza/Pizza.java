package com.nts.designpattern.factory.abstraction.model.pizza;

import com.nts.designpattern.factory.abstraction.model.cheese.Cheese;
import com.nts.designpattern.factory.abstraction.model.clams.Clams;
import com.nts.designpattern.factory.abstraction.model.dough.Dough;
import com.nts.designpattern.factory.abstraction.model.perpperoni.Pepperoni;
import com.nts.designpattern.factory.abstraction.model.sauce.Sauce;
import com.nts.designpattern.factory.abstraction.model.veggies.Veggies;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggies[] veggies;
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the Pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}

	public String toString() {
		return name;
	}
}
