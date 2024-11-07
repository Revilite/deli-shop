package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.RegularToppings;
import com.pluralsight.delishop.backend.inventory.SandwichSize;

public class RegularTopping extends Topping {
    protected RegularToppings regularTopping;

    public RegularTopping(boolean hasExtra, SandwichSize size, RegularToppings regularTopping) {
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
}
