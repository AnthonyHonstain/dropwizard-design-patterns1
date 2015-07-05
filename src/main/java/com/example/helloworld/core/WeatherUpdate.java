package com.example.helloworld.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class WeatherUpdate {
    private long id;

    @NotEmpty
    private float temperature;

    @NotEmpty
    private float humidity;

    @NotEmpty
    private float pressure;


    public WeatherUpdate() {
        // Jackson deserialization
    }

    public WeatherUpdate(long id, float temperature, float humidity, float pressure) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}