package com.pluralsight.delishop.backend;

public class Chips implements Product {
    private String name;


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
