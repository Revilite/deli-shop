package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.BreadType;
import com.pluralsight.delishop.backend.inventory.SandwichSize;

import java.util.ArrayList;

public class Sandwich extends Product{
    private ArrayList<Topping> toppings;
    private boolean isToasted;
    private BreadType breadType;
    private SandwichSize sandwichSize;

    public Sandwich(double totalPrice, String name, int id, SandwichSize size, ArrayList<Topping> toppings, boolean isToasted, BreadType breadType) {
        super(totalPrice, name, id);
        this.toppings = toppings;
        this.isToasted = isToasted;
        this.breadType = breadType;
    }
}
