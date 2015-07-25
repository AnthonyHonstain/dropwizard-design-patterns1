package com.example.helloworld.core;

public class PizzaOrder {

    private long id;
    private String description;
    private String prepare;
    private String bake;
    private String cut;
    private String box;

    public PizzaOrder() {
        // Jackson deserialization
    }

    public PizzaOrder(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public PizzaOrder(long id, Pizza pizza) {
        this.id = id;
        this.description = pizza.getDescription();
        this.prepare = pizza.getPrepare();
        this.bake = pizza.getBake();
        this.cut = pizza.getCut();
        this.box = pizza.getBox();
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPrepare() {
        return prepare;
    }

    public void setPrepare(String prepare) {
        this.prepare = prepare;
    }

    public String getBake() {
        return bake;
    }

    public void setBake(String bake) {
        this.bake = bake;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }
}