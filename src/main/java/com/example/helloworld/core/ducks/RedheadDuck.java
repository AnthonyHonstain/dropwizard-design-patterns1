package com.example.helloworld.core.ducks;

import com.example.helloworld.core.Duck;
import com.example.helloworld.core.behaviors.FlyWithWings;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void Display() {
        System.out.println("Display Redhead");
    }
}
