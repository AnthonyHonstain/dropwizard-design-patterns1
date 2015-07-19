package com.example.helloworld.core.condiments;

import com.example.helloworld.core.beverages.Beverage;

/**
 * Created by Anthony Honstain on 7/18/15.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String describeDrink() {
        return this.beverage.describeDrink() + " Mocha";
    }

    public double getCost() {
        return this.beverage.getCost() + 0.2;
    }

}
