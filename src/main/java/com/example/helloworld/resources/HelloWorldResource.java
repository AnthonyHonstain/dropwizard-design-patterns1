package com.example.helloworld.resources;

import com.example.helloworld.core.Saying;
import com.example.helloworld.core.WeatherData;
import com.example.helloworld.core.WeatherUpdate;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    private final WeatherData weatherData;

    public HelloWorldResource(String template, String defaultName, WeatherData weatherData) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
        this.weatherData = weatherData;
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }

    @POST
    @Timed
    public void measurementChange(WeatherUpdate weatherUpdate) {
        System.out.println(String.format("Notifying observers id:{0}", weatherUpdate.getId()));
        weatherData.notifyObservers(
                weatherUpdate.getTemperature(),
                weatherUpdate.getHumidity(),
                weatherUpdate.getPressure());
    }
}