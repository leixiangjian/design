package com.design.pattern.observer;

import com.design.pattern.observer.observable.WeatherData;
import com.design.pattern.observer.observer.CurrentConditionDisplay;

public class ObserverApplication {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
