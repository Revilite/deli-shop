package com.pluralsight.delishop.backend;

public abstract class PremiumTopping extends Topping {
    double price;
    public PremiumTopping(boolean hasExtra, Sandwich.SandwichSize size) {
        super(hasExtra, size);
    }

}
