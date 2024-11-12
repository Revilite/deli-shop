package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.RegularToppings;

public class RegularTopping extends Topping {
    protected RegularToppings regularTopping;

    public RegularTopping(boolean hasExtra, Sandwich.SandwichSize size, RegularToppings regularTopping) {
        super(hasExtra, size);
        this.regularTopping = regularTopping;
    }

    public RegularToppings getRegularTopping() {
        return regularTopping;
    }

    public boolean hasExtra(){
        return hasExtra;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "RegularTopping{" +
                "regularTopping=" + regularTopping +
                ", hasExtra=" + hasExtra +
                ", size=" + size +
                '}';
    }
}
