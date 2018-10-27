package com.design.pattern.observer.observer;

import java.util.Observable;
import java.util.Observer;

import com.design.pattern.observer.observable.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");

	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
