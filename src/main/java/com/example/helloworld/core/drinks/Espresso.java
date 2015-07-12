package com.example.helloworld.core.drinks;

import com.example.helloworld.core.Drink;

/**
 * Created by Anthony Honstain on 7/11/15.
 */
public class Espresso extends Drink {

    public Espresso() {
        this.setBaseCost(2.0);
    }

    @Override
    public String describeDrink() {
        return this.getClass().getSimpleName();
    }
}
