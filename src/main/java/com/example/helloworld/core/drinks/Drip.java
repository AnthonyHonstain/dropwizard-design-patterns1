package com.example.helloworld.core.drinks;

import com.example.helloworld.core.Drink;

/**
 * Created by Anthony Honstain on 7/11/15.
 */
public class Drip extends Drink {

    public Drip() {
        this.setBaseCost(1.0);
    }

    @Override
    public String describeDrink() {
        return this.getClass().getSimpleName();
    }
}
