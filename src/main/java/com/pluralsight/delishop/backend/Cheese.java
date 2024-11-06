package com.pluralsight.delishop.backend;

public class Cheese extends PremiumTopping {
    private Cheese typeOfCheese;

    public Cheese(boolean hasExtra, double price, Cheese typeOfCheese) {
        super(hasExtra, price);
        this.typeOfCheese = typeOfCheese;
    }
}
