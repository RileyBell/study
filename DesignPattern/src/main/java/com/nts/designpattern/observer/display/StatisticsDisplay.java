package com.nts.designpattern.observer.display;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.nts.designpattern.observer.DisplayElement;
import com.nts.designpattern.observer.WeatherData;

/*public class StatisticsDisplay implements Observer, DisplayElement {
	private List<Float> temperatures;
	private float avg;
	private float max;
	private float min;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		temperatures = new ArrayList<Float>();
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		temperatures.add(temperature);
		this.avg = getAvg();
		this.max = getMax();
		this.min = getMin();
		display();
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", avg, max, min);
	}

	private float getAvg() {
		float total = 0;

		for (float temperature : temperatures) {
			total += temperature;
		}

		return total / temperatures.size();
	}

	private float getMax() {
		return Collections.max(temperatures);
	}

	private float getMin() {
		return Collections.min(temperatures);
	}
}*/

public class StatisticsDisplay implements Observer, DisplayElement {
	Observable observable;
	private List<Float> temperatures;
	private float avg;
	private float max;
	private float min;

	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		temperatures = new ArrayList<Float>();
		observable.addObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		temperatures.add(temperature);
		this.avg = calcAvg();
		this.max = calcMax();
		this.min = calcMin();
		display();
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			temperatures.add(weatherData.getTemperature());
			this.avg = calcAvg();
			this.max = calcMax();
			this.min = calcMin();
			display();
		}
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n", avg, max, min);
	}

	private float calcAvg() {
		float total = 0;

		for (float temperature : temperatures) {
			total += temperature;
		}

		return total / temperatures.size();
	}

	private float calcMax() {
		return Collections.max(temperatures);
	}

	private float calcMin() {
		return Collections.min(temperatures);
	}

}
