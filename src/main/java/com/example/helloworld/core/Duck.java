package com.example.helloworld.core;

import com.example.helloworld.core.behaviors.NoFlight;
import com.example.helloworld.core.behaviors.Quack;

/**
 * Created by Anthony Honstain on 7/3/15.
 */
public class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
        // Setting some basic defaults in the constructor, alternatively
        // you could control this using a SETTER
        this.flyBehavior = new NoFlight();
        this.quackBehavior = new Quack();
    }

    public void Swim() {
        System.out.println("Swimming");
    }

    public void Quack() {
        //System.out.println("quack");
        quackBehavior.quack();
    }

    public void Display() {
        System.out.println("Display Duck");
    }

    public void Fly() {
        //System.out.println("Flying");
        flyBehavior.fly();
    }
}
