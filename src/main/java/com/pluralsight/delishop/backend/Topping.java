package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.SandwichSize;

public abstract class Topping {

    protected boolean hasExtra;
    protected SandwichSize size;

    public Topping(boolean hasExtra, SandwichSize size) {
        this.hasExtra = hasExtra;
        this.size = size;
    }

    public abstract double getPrice();


}
