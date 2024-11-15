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

        sb.append(regularTopping.toString().charAt(0) + regularTopping.toString().substring(1).toLowerCase());

        sb.append("&nbsp".repeat(90));
        sb.append(String.format("$%.2f", getPrice()));

        return sb.toString();
    }
    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        sb.append(regularTopping.toString().charAt(0) + regularTopping.toString().substring(1).toLowerCase());
        sb.append(String.format("     $%.2f", getPrice()));
        return sb.toString();
    }
}
