package com.pluralsight.delishop.backend;

public abstract class Topping {

    private boolean hasExtra;
    private double price;

    public Topping(boolean hasExtra, double price) {
        this.hasExtra = hasExtra;
        this.price = price;
    }
}
