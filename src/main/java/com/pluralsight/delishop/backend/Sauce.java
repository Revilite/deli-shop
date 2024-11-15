package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.RegularToppings;

public class Sauce implements Product{
    RegularToppings sauce;

    public Sauce(RegularToppings sauce) {
        this.sauce = sauce;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sauce.toString().charAt(0) + sauce.toString().substring(1).toLowerCase());
        sb.append(String.format("    $%.2f\n", getPrice()));
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sauce.toString().charAt(0) + sauce.toString().substring(1).toLowerCase());
        sb.append("&nbsp".repeat(90));
        sb.append(String.format("     $%.2f", getPrice()));
        return sb.toString();
    }
}
