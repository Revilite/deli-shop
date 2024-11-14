package com.pluralsight.delishop.backend;

public abstract class Topping {

    protected boolean hasExtra;
    protected Sandwich.SandwichSize size;

    public Topping(boolean hasExtra, Sandwich.SandwichSize size) {
        this.hasExtra = hasExtra;
        this.size = size;
    }

    public abstract double getPrice();

    public abstract String toCSVString();

}
