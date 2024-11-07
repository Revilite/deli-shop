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

    public Sandwich(SandwichSize size, boolean isToasted, BreadType breadType) {
        this.toppings = toppings;
        this.isToasted = isToasted;
        this.breadType = breadType;
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

        }
        return price;
    }
}
