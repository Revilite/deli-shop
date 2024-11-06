package com.pluralsight.delishop.backend;

public class Meat extends PremiumTopping {
    private Meat typeOfMeat;

    public Meat(boolean hasExtra, double price, Meat typeOfMeat) {
        super(hasExtra, price);
        this.typeOfMeat = typeOfMeat;
    }
}
