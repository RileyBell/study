package com.nts.designpattern.observer.display;

import com.nts.designpattern.observer.DisplayElement;
import com.nts.designpattern.observer.Observer;
import com.nts.designpattern.observer.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	private float pressure;
	private Subject weatherData;
	private String printText;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		if (this.pressure > pressure) {
			printText = "Improving weather on the way!";
		} else if (this.pressure < pressure) {
			printText = "Watch out for cooler, rainy weather";
		} else {
			printText = "More of the same";
		}
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Forecast: " + printText);
	}

}
