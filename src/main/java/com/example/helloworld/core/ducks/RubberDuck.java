package com.example.helloworld.core.ducks;

import com.example.helloworld.core.Duck;
import com.example.helloworld.core.behaviors.Squeak;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new Squeak();
    }

    @Override
    public void Display() {
        System.out.println("Display RubberDuck");
    }
}
