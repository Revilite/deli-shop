package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.SandwichSize;

public abstract class PremiumTopping extends Topping {
    double price;
    public PremiumTopping(boolean hasExtra, SandwichSize size) {
        super(hasExtra, size);
    }

}
