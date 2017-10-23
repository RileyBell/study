package com.nts.designpattern.command.normal.macro;

public class Hottub {

	public Hottub() {
	}

	public void on() {
		heating(104);
		bubbling();
	}

	public void off() {
		cooling(98);
	}

	public void heating(int degree) {
		System.out.println("Hottub is heating to a streaming " + degree + " degrees");
	}

	public void bubbling() {
		System.out.println("Hottub is bubbling!");
	}

	public void cooling(int degree) {
		System.out.println("Hottub is cooling to  " + degree + " degrees");
	}
}
