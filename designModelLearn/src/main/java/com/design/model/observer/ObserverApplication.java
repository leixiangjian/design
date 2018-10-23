package com.design.model.observer;

import com.design.model.observer.observable.WeatherData;
import com.design.model.observer.observer.CurrentConditionDisplay;

public class ObserverApplication {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
