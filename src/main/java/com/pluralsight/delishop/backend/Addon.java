package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.SandwichSize;

public abstract class Addon extends Product{

    public Addon(double totalPrice, String name, int id) {
        super(totalPrice, name, id);
    }
}
