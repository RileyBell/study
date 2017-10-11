package com.nts.designpattern.observer.display;

import java.util.Observable;
import java.util.Observer;

import com.nts.designpattern.observer.DisplayElement;
import com.nts.designpattern.observer.WeatherData;

/*public class ForecastDisplay implements Observer, DisplayElement {
	private float pressure;
	private Subject weatherData;
	private String printText;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		if (this.pressure < pressure) {
			printText = "Improving weather on the way!";
		} else if (this.pressure > pressure) {
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

}*/
	public class ForecastDisplay implements Observer, DisplayElement {
		Observable observable;
		private float pressure;
		private String printText;

		public ForecastDisplay(Observable observable) {
			this.observable = observable;
			observable.addObserver(this);
		}

		public void update(Observable obs, Object arg) {
			if (obs instanceof WeatherData) {
				WeatherData weatherData = (WeatherData) obs;
				float currentPressure = weatherData.getPressure();

				if (this.pressure < currentPressure) {
					printText = "Improving weather on the way!";
				} else if (this.pressure > currentPressure) {
					printText = "Watch out for cooler, rainy weather";
				} else {
					printText = "More of the same";
				}
				this.pressure = currentPressure;
				display();
			}
		}

		public void display() {
			System.out.println("Forecast: " + printText);
		}

	}
