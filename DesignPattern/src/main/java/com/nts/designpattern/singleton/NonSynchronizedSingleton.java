package com.nts.designpattern.singleton;

public class NonSynchronizedSingleton {
	private static NonSynchronizedSingleton uniqueInstance;

	private NonSynchronizedSingleton() {
	}

	public static NonSynchronizedSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new NonSynchronizedSingleton();
		}
		return uniqueInstance;
	}

}
