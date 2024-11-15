package com.pluralsight.delishop.backend;

import java.util.ArrayList;

public class Sandwich implements Product {
    private ArrayList<Topping> toppings;
    protected boolean isToasted;
    protected BreadType breadType;
    protected SandwichSize sandwichSize;
    protected double price;

    public Sandwich(SandwichSize sandwichSize, boolean isToasted, BreadType breadType, ArrayList<Topping> toppings) {
        this.isToasted = isToasted;
        this.breadType = breadType;
        this.sandwichSize = sandwichSize;
        this.toppings = toppings;
    }

    public SandwichSize getSandwichSize() {
        return sandwichSize;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public double getBreadPrice() {
        double price = 0;
        if (sandwichSize == SandwichSize.FOURINCH) {
            price += 5.50;
        } else if (sandwichSize == SandwichSize.EIGHTINCH) {
            price += 7;
        } else if (sandwichSize == SandwichSize.TWELVEINCH) {
            price += 8.50;
        }

        return price;
    }


    @Override
    public double getPrice() {
        price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrice();
        }
        if (sandwichSize == SandwichSize.FOURINCH) {
            price += 5.50;
        } else if (sandwichSize == SandwichSize.EIGHTINCH) {
            price += 7;
        } else if (sandwichSize == SandwichSize.TWELVEINCH) {
            price += 8.50;
        }

        return price;
    }

    public enum SandwichSize {
        FOURINCH, EIGHTINCH, TWELVEINCH;
    }

    public enum BreadType {
        WHITE, WHEAT, RYE, WRAP
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (sandwichSize == SandwichSize.FOURINCH) {
            sb.append("4''");
        } else if (sandwichSize == SandwichSize.EIGHTINCH) {
            sb.append("8''");
        } else {
            sb.append("12''");
        }

        if (breadType != BreadType.WRAP) {
            sb.append(breadType.toString().substring(0, 1) + breadType.toString().substring(1, breadType.toString().length()).toLowerCase() + " Bread");
        } else {
            sb.append(breadType.toString().substring(0, 1) + breadType.toString().substring(1, breadType.toString().length()).toLowerCase());
        }

        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }

        sb.append(String.format("$%.2f <br>", getPrice()));

        for (Topping topping : toppings) {
            sb.append("  -  " + topping.toString() + "<br>");
        }
        return sb.toString();
    }

    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        if (sandwichSize == SandwichSize.FOURINCH) {
            sb.append("4''");
        } else if (sandwichSize == SandwichSize.EIGHTINCH) {
            sb.append("8''");
        } else {
            sb.append("12''");
        }
        if (breadType != BreadType.WRAP) {
            sb.append(breadType.toString().substring(0, 1) + breadType.toString().substring(1, breadType.toString().length()).toLowerCase() + " Bread");
        } else {
            sb.append(breadType.toString().substring(0, 1) + breadType.toString().substring(1, breadType.toString().length()).toLowerCase());
        }
        sb.append(String.format("     $%.2f \n", getPrice()));
        sb.append(sandwichSize + "\n");
        for (Topping topping : getToppings()) {
            sb.append("- " + topping.toCSVString() + "\n");
        }

        return sb.toString();
    }
}
