package com.example.helloworld.core;

/**
 * Created by Anthony Honstain on 7/8/15.
 */
public abstract class Drink {

    private boolean whip;
    private boolean mocha;
    private double baseCost;

    public abstract String describeDrink();

    public double getCost() {
        double totalCost = baseCost;
        if (mocha) {
            totalCost += 0.5;
        }
        if (whip) {
            totalCost += 1.0;
        }
        return totalCost;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
}
