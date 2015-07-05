package com.example.helloworld.core;

/**
 * Created by Anthony Honstain on 7/4/15.
 */
public interface Subject {

    void addObserver(String name, WeatherObserver weatherObserver);

    void removeObserver(String name);

    void notifyObservers(float temp, float humidity, float pressure);

}
