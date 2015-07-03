package com.example.helloworld.core.behaviors;

import com.example.helloworld.core.FlyBehavior;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class NoFlight implements FlyBehavior {
    public void fly() {
        System.out.println("No Flight");
    }
}
