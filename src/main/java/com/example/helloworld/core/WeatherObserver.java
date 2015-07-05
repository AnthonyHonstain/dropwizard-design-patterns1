package com.example.helloworld.core;

/**
 * Created by Anthony Honstain on 7/4/15.
 */
public interface WeatherObserver {

    void update(float temp, float humidity, float pressure);
}
