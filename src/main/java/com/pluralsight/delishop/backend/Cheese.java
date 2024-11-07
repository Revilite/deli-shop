package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.SandwichSize;
import com.pluralsight.delishop.backend.inventory.TypeOfCheese;

public class Cheese extends PremiumTopping {
    private TypeOfCheese typeOfCheese;

    public Cheese(boolean hasExtra, SandwichSize size, TypeOfCheese typeOfCheese) {
        super(hasExtra, size);
        this.typeOfCheese = typeOfCheese;
    }

    @Override
    public double getPrice() {
        if (size == SandwichSize.FOURINCH) {
            price = .75;
            if (hasExtra) price += .30;
        } else if (size == SandwichSize.EIGHTINCH) {
            price = 1.5;
            if (hasExtra) price += .60;
        } else if (size == SandwichSize.TWELVEINCH) {
            price = 2.25;
            if (hasExtra) price += .90;
        }

        return price;
    }
}
