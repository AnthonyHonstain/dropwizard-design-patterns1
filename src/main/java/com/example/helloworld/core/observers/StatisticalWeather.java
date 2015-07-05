package com.example.helloworld.core.observers;

import com.example.helloworld.core.WeatherObserver;

/**
 * Created by Anthony Honstain on 7/4/15.
 */
public class StatisticalWeather implements WeatherObserver {

    public void update(float temp, float humidity, float pressure) {
        System.out.println(String.format("%s temp:%f humidity:%f pressure:%f",
                this.getClass().getSimpleName(), temp, humidity, pressure));
    }
}
