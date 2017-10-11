package com.nts.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChaged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChaged();
	}

	// 기타 WeatherData 메소드
}
