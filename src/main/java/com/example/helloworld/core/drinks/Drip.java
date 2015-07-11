package com.example.helloworld.core.drinks;

import com.example.helloworld.core.Drink;

/**
 * Created by Anthony Honstain on 7/11/15.
 */
public class Drip implements Drink {

    @Override
    public String describeDrink() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
