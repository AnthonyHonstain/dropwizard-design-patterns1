package com.example.helloworld.core;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Anthony Honstain on 7/4/15.
 */
public class WeatherData implements Subject {

    // We use the ConcurrentHashMap here because multiple different threads
    // could be calling in to add and observer or remove one.
    private ConcurrentHashMap<String, WeatherObserver> observerMap;

    public WeatherData() {
        observerMap = new ConcurrentHashMap<>();
    }

    public void addObserver(String name, WeatherObserver weatherObserver) {
        observerMap.put(name, weatherObserver);
    }

    public void removeObserver(String name) {
        observerMap.remove(name);
    }

    public void notifyObservers(final float temp, final float humidity, final float pressure) {
        observerMap.forEach((k,v) -> v.update(temp, humidity, pressure));
    }

}
