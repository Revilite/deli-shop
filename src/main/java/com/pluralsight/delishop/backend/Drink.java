package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.DrinkSize;

public class Drink extends Addon {
    private DrinkSize drinkSize;

    public Drink(double totalPrice, String name, int id) {
        super(totalPrice, name, id);
    }
}
