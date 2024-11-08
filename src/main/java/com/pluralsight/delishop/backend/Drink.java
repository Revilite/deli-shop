package com.pluralsight.delishop.backend;

import com.pluralsight.delishop.backend.inventory.DrinkSize;

public class Drink implements Addon {
    private DrinkSize drinkSize;
    protected double price;


    public Drink(DrinkSize drinkSize) {
        this.drinkSize = drinkSize;
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
}
