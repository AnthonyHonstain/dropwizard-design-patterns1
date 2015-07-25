package com.example.helloworld.health;

import com.codahale.metrics.health.HealthCheck;

public class TemplateHealthCheck extends HealthCheck {

    public TemplateHealthCheck() {
    }

    @Override
    protected Result check() throws Exception {
        // TODO fix always healthy.
        return Result.healthy();
    }
}