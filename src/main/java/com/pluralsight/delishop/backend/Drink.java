package com.pluralsight.delishop.backend;

public class Drink implements Product {
    private DrinkSize drinkSize;
    private String name;
    protected double price;


    public Drink(DrinkSize drinkSize,  String name) {
        this.drinkSize = drinkSize;
        this.name = name;
    }

    @Override
    public double getPrice() {
        price = 0;
        if(drinkSize == DrinkSize.SMALL){
            price += 2;
        }
        else if(drinkSize == DrinkSize.MEDIUM){
            price += 2.5;
        }
        else if(drinkSize == DrinkSize.LARGE){
            price += 3;
        }
        return price;
    }

    public enum DrinkSize {
        SMALL,
        MEDIUM,
        LARGE

    }

}
