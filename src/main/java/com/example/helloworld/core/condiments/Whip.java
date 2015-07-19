package com.example.helloworld.core.condiments;

import com.example.helloworld.core.beverages.Beverage;

/**
 * Created by Anthony Honstain on 7/18/15.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String describeDrink() {
        return this.beverage.describeDrink() + " Whip";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.5;
    }

}
