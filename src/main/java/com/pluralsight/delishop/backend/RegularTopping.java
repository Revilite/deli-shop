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


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(regularTopping.toString().substring(0, 1) + regularTopping.toString().substring(1, regularTopping.toString().length()).toLowerCase());

        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }
        sb.append(String.format("$%.2f", getPrice()));

        return sb.toString();
    }
    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        sb.append(regularTopping.toString().substring(0, 1) + regularTopping.toString().substring(1, regularTopping.toString().length()).toLowerCase());
        sb.append(String.format("$%.2f", getPrice()));
        return sb.toString();
    }
}
