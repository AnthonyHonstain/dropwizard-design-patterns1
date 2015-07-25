package com.example.helloworld.resources;

import com.example.helloworld.core.CheesePizza;
import com.example.helloworld.core.GreekPizza;
import com.example.helloworld.core.Pizza;
import com.example.helloworld.core.PizzaOrder;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.validation.Valid;
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
        Pizza newPizza;
        switch (value) {
            case "CheesePizza": newPizza = new CheesePizza();
                break;
            case "GreekPizza": newPizza = new GreekPizza();
                break;
            default: throw new WebApplicationException("Invalid pizza name");
        }
        return new PizzaOrder(counter.incrementAndGet(), newPizza);
    }
}