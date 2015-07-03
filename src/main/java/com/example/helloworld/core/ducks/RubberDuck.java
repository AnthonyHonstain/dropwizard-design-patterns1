package com.example.helloworld.core.ducks;

import com.example.helloworld.core.Duck;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class RubberDuck extends Duck {
    @Override
    public void Display() {
        System.out.println("Display RubberDuck");
    }

    @Override
    public void Quack() {
        System.out.println("Squeak");
    }
}
