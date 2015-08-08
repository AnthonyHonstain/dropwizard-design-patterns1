package com.example.helloworld.resources;

import com.example.helloworld.core.pizza.CheesePizza;
import com.example.helloworld.core.pizza.GreekPizza;
import com.example.helloworld.core.pizza.Pizza;
import com.example.helloworld.core.PizzaOrder;
import com.example.helloworld.core.pizzafactory.IPizzaFactory;
import com.example.helloworld.core.pizzafactory.NewYorkPizzaFactory;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final AtomicLong counter;

    public HelloWorldResource() {
        this.counter = new AtomicLong();
    }

    @POST
    @Timed
    @Path("/orderPizza")
    public PizzaOrder orderPizza(@QueryParam("name") Optional<String> name) {
        final String value = name.or("CheesePizza");
        // NOTE - this is not how I would handle REST endpoint
        // validation, it is just a walk through of the factory pattern.
        IPizzaFactory pizzaFactory = new NewYorkPizzaFactory();
        Pizza newPizza = pizzaFactory.createPizza(value);

        return new PizzaOrder(counter.incrementAndGet(), newPizza);
    }
}