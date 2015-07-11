package com.example.helloworld.resources;

import com.example.helloworld.core.CalculatedCost;
import com.example.helloworld.core.Drink;
import com.example.helloworld.core.drinks.Drip;
import com.example.helloworld.core.drinks.Espresso;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

//    @GET
//    @Timed
//    public Saying sayHello(@QueryParam("name") Optional<String> name) {
//        final String value = String.format(template, name.or(defaultName));
//        return new Saying(counter.incrementAndGet(), value);
//    }

    /**
     * Calculate the cost of the given coffee drink.
     *
     * Drinks can be plain or combined with 1 or more modifiers. Drinks
     * have a base cost and each modifier has its own cost.
     *
     * Base Drinks:
     *   Drip
     *   Espresso
     *
     * Drink Modifiers:
     *   Whip
     *   Mocha
     *
     * WARNING - the parameters need to line up and get used or you will see
     * some nondescript validation/injection errors at runtime.
     * @param drink
     * @return
     */
    @GET
    @Timed
    @Path("/calculateCost")
    public CalculatedCost calculateCost(
            @QueryParam("drink") Optional<String> drink) {
            //@QueryParam("modifiers") Optional<List<String>> modifiers) {

        if (drink.isPresent()) {
            Drink newDrink;
            switch (drink.get()) {
                case "drip": newDrink = new Drip();
                    break;
                case "espresso": newDrink = new Espresso();
                    break;
                default: newDrink = new Drip();
                    break;
            }

            return new CalculatedCost(counter.incrementAndGet(),
                    newDrink.describeDrink(), String.valueOf(newDrink.getCost()));
        }
        return new CalculatedCost(counter.incrementAndGet(), "unknown", "0.0");
    }
}