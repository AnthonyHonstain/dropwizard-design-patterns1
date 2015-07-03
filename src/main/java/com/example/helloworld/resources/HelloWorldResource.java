package com.example.helloworld.resources;

import com.example.helloworld.core.Duck;
import com.example.helloworld.core.Saying;
import com.example.helloworld.core.ducks.MallardDuck;
import com.example.helloworld.core.ducks.RedheadDuck;
import com.example.helloworld.core.ducks.RubberDuck;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;
import com.google.common.collect.ImmutableList;

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

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {

        // -------------------------------------------------------------
        // EXPERIMENT ZONE - just going to plumb the results out to console
        // TODO - clean this up, should I use logging? This is really just a learning tool
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        ImmutableList<Duck> ducks = ImmutableList.of(mallardDuck, redheadDuck, rubberDuck);
        for(Duck duck : ducks) {
            System.out.println("==== New Duck ====");
            duck.Display();
            duck.Quack();
            duck.Fly();
            duck.Swim();
        }
        // -------------------------------------------------------------

        final String value = String.format(template, name.or(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }
}