package com.pluralsight.delishop.backend;


public class Meat extends PremiumTopping {
    protected Meat typeOfMeat;

    public Meat(Meat typeOfMeat, Sandwich.SandwichSize size, boolean hasExtra) {
        super(hasExtra, size);
        this.typeOfMeat = typeOfMeat;
    }

    public Meat getTypeOfMeat() {
        return typeOfMeat;
    }

    @Override
    public double getPrice() {
        if (size == Sandwich.SandwichSize.FOURINCH) {
            price = 1;
            if (hasExtra) price += .50;
        } else if (size == Sandwich.SandwichSize.EIGHTINCH) {
            price = 1.5;
            if (hasExtra) price += 1;
        } else if (size == Sandwich.SandwichSize.TWELVEINCH) {
            price = 2;
            if (hasExtra) price += 1.50;
        }

        return price;
    }

    public enum TypeOfMeat {
        STEAK,
        HAM,
        SALAMI,
        ROAST_BEEF,
        CHICKEN,
        BACON;
    }
}
