package com.example.helloworld.core.pizza;

import com.example.helloworld.core.pizza.Pizza;

/**
 * Created by Anthony Honstain on 7/25/15.
 */
public class CheesePizza implements Pizza {

    @Override
    public String getDescription() {
        return "CheesePizza description";
    }

    @Override
    public String getPrepare() {
        return "CheesePizza prepare";
    }

    @Override
    public String getBake() {
        return "CheesePizza bake";
    }

    @Override
    public String getCut() {
        return "CheesePizza cut";
    }

    @Override
    public String getBox() {
        return "CheesePizza box";
    }
}
