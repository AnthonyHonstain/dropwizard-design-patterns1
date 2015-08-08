package com.example.helloworld.core.pizzafactory;

import com.example.helloworld.core.pizza.Pizza;

/**
 * Created by Anthony Honstain on 8/8/15.
 */
public interface IPizzaFactory {

    Pizza createPizza(String pizzaName);
}
