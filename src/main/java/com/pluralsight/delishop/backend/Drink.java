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
        sb.append(drinkSize.toString().substring(0, 1) + drinkSize.toString().substring(1, drinkSize.toString().length()).toLowerCase());

        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }
        sb.append(String.format("$%.2f <br>", getPrice()));
        sb.append(" -" + name);
        return sb.toString();
    }

    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();
        sb.append(drinkSize.toString().substring(0, 1) + drinkSize.toString().substring(1, drinkSize.toString().length()).toLowerCase());
        sb.append(String.format("$%15.2f \n", getPrice()));
        sb.append(name + "\n");
        return sb.toString();

    }
}
