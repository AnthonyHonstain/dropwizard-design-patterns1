package com.example.helloworld.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculatedCost {
    private long id;

    private String drinkName;
    private String drinkCost;

    public CalculatedCost() {
        // Jackson deserialization
    }

    public CalculatedCost(long id, String drinkName, String drinkCost) {
        this.id = id;
        this.drinkName = drinkName;
        this.drinkCost = drinkCost;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getDrinkName() {
        return drinkName;
    }

    @JsonProperty
    public String getDrinkCost() {
        return drinkCost;
    }
}