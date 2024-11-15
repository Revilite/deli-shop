package com.pluralsight.delishop.backend;

public class Drink implements Product {
    private DrinkSize drinkSize;
    private String name;
    protected double price;


    public Drink(DrinkSize drinkSize, String name) {
        this.drinkSize = drinkSize;
        this.name = name;
    }

    @Override
    public double getPrice() {
        price = 0;
        if (drinkSize == DrinkSize.SMALL) {
            price += 2;
        } else if (drinkSize == DrinkSize.MEDIUM) {
            price += 2.5;
        } else if (drinkSize == DrinkSize.LARGE) {
            price += 3;
        }
        return price;
    }

    public enum DrinkSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(drinkSize.toString().charAt(0) + drinkSize.toString().substring(1).toLowerCase());

        sb.append("&nbsp".repeat(90));
        sb.append(String.format("$%.2f <br>", getPrice()));
        sb.append(" -" + name);
        return sb.toString();
    }

    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        sb.append(drinkSize.toString().charAt(0) + drinkSize.toString().substring(1).toLowerCase());
        sb.append(String.format("     $%.2f \n", getPrice()));
        sb.append(name + "\n");
        return sb.toString();

    }
}
