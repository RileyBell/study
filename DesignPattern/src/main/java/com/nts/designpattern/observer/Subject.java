package com.nts.designpattern.observer;

public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
