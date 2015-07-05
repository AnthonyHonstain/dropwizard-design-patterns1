package com.example.helloworld;

import com.example.helloworld.core.WeatherData;
import com.example.helloworld.core.observers.CurrentWeather;
import com.example.helloworld.core.observers.HistoricalWeather;
import com.example.helloworld.core.observers.StatisticalWeather;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.example.helloworld.resources.HelloWorldResource;
import com.example.helloworld.health.TemplateHealthCheck;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver("CurrentWeather", new CurrentWeather());
        weatherData.addObserver("HistoricalWeather", new HistoricalWeather());
        weatherData.addObserver("StatisticalWeather", new StatisticalWeather());

        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName(),
                weatherData
        );
        environment.jersey().register(resource);

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}