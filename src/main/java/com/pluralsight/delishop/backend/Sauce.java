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
        sb.append(sauce.toString().substring(0,1) + sauce.toString().substring(1, sauce.toString().length()).toLowerCase());
        sb.append(String.format("    $%.2f\n", getPrice()));
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sauce.toString().substring(0,1) + sauce.toString().substring(1, sauce.toString().length()).toLowerCase());
        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }
        sb.append(String.format("$%.2f", getPrice()));
        return sb.toString();
    }
}
