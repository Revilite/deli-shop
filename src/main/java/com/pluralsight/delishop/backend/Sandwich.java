package com.pluralsight.delishop.backend;

import java.util.ArrayList;

public class Sandwich implements Product {
    protected ArrayList<Topping> toppings;
    protected boolean isToasted;
    protected BreadType breadType;
    protected SandwichSize sandwichSize;
    protected double price;

    public Sandwich(SandwichSize sandwichSize, boolean isToasted, BreadType breadType, ArrayList<Topping> toppings) {
        this.isToasted = isToasted;
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.toppings = toppings;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }


    @Override
    public double getPrice() {
        price = 0;
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

    public enum SandwichSize {
        FOURINCH,
        EIGHTINCH,
        TWELVEINCH;
    }

    public enum BreadType {
        WHITE,
        WHEAT,
        RYE,
        WRAP
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "toppings=" + toppings +
                ", isToasted=" + isToasted +
                ", breadType=" + breadType +
                ", sandwichSize=" + sandwichSize +
                ", price=" + getPrice() +
                '}';
    }
}
