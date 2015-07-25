package com.example.helloworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {

    private String stub;

    @JsonProperty
    public String getStub() {
        return stub;
    }

    @JsonProperty
    public void setStub(String stub) {
        this.stub = stub;
    }
}