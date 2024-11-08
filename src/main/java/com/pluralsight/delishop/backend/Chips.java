package com.pluralsight.delishop.backend;

public class Chips implements Addon {
    protected String name;

    public Chips(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
