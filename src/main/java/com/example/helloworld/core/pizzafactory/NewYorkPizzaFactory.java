package com.example.helloworld.core.pizzafactory;

import com.example.helloworld.core.pizza.CheesePizza;
import com.example.helloworld.core.pizza.GreekPizza;
import com.example.helloworld.core.pizza.Pizza;

import javax.ws.rs.WebApplicationException;

/**
 * Created by Anthony Honstain on 8/8/15.
 *
 * NOTE - this is a PARAMETERIZED FACTORY METHOD since
 * it can return multiple objects (instead of just a
 * single object that has a bunch of different settings).
 */
public class NewYorkPizzaFactory implements IPizzaFactory {

    public Pizza createPizza(String pizzaName) {
        Pizza newPizza;
        switch (pizzaName) {
            case "CheesePizza": newPizza = new CheesePizza();
                break;
            case "GreekPizza": newPizza = new GreekPizza();
                break;
            default: throw new WebApplicationException("Invalid pizza name");
        }
        return newPizza;
    }
}
