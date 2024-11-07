package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.BreadType;
import com.pluralsight.delishop.backend.inventory.SandwichSize;

import java.util.ArrayList;

public class Sandwich extends Product {
    protected ArrayList<Topping> toppings = new ArrayList<>();
    protected boolean isToasted;
    protected BreadType breadType;
    protected SandwichSize sandwichSize;
    protected double price;

    public Sandwich(SandwichSize sandwichSize, boolean isToasted, BreadType breadType) {
        this.isToasted = isToasted;
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }


    @Override
    public double getPrice() {
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrice();
        }
        if (sandwichSize == SandwichSize.FOURINCH) {
            price += 5.50;
        } else if (sandwichSize == SandwichSize.EIGHTINCH) {
            price += 7;
        } else if (sandwichSize == SandwichSize.TWELVEINCH) {
            price += 8.50;
        }

        return price;
    }
}
