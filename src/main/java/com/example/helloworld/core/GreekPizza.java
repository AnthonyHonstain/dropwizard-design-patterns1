package com.example.helloworld.core;

/**
 * Created by Anthony Honstain on 7/25/15.
 */
public class GreekPizza implements Pizza {

    @Override
    public String getDescription() {
        return "GreekPizza description";
    }

    @Override
    public String getPrepare() {
        return "GreekPizza prepare";
    }

    @Override
    public String getBake() {
        return "GreekPizza bake";
    }

    @Override
    public String getCut() {
        return "GreekPizza cut";
    }

    @Override
    public String getBox() {
        return "GreekPizza box";
    }
}
