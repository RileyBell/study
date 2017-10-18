package com.nts.designpattern.singleton;

public class InitializedSingleton {
	private static InitializedSingleton uniqueInstance = new InitializedSingleton();

	private InitializedSingleton() {
	}

	public static InitializedSingleton getInstance() {
		return uniqueInstance;
	}
}
