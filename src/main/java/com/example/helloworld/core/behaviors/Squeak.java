package com.example.helloworld.core.behaviors;

import com.example.helloworld.core.QuackBehavior;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
