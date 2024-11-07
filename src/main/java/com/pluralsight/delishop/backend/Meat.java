package com.pluralsight.delishop.backend;


import com.pluralsight.delishop.backend.inventory.SandwichSize;

public class Meat extends PremiumTopping {
    protected Meat typeOfMeat;

    public Meat(Meat typeOfMeat, SandwichSize size, boolean hasExtra) {
        super(hasExtra, size);
        this.typeOfMeat = typeOfMeat;
    }

    public Meat getTypeOfMeat() {
        return typeOfMeat;
    }

    @Override
    public double getPrice() {
        if (size == SandwichSize.FOURINCH) {
            price = 1;
            if (hasExtra) price += .50;
        } else if (size == SandwichSize.EIGHTINCH) {
            price = 1.5;
            if (hasExtra) price += 1;
        } else if (size == SandwichSize.TWELVEINCH) {
            price = 2;
            if (hasExtra) price += 1.50;
        }

        return price;
    }
}
