package com.pluralsight.delishop.backend;

public class Cheese extends PremiumTopping {
    private TypeOfCheese typeOfCheese;

    public Cheese(TypeOfCheese typeOfCheese, Sandwich.SandwichSize size, boolean hasExtra) {
        super(hasExtra, size);
        this.typeOfCheese = typeOfCheese;
    }

    public TypeOfCheese getTypeOfCheese() {
        return typeOfCheese;
    }

    @Override
    public double getPrice() {
        if (size == Sandwich.SandwichSize.FOURINCH) {
            price = .75;
            if (hasExtra) price += .30;
        } else if (size == Sandwich.SandwichSize.EIGHTINCH) {
            price = 1.5;
            if (hasExtra) price += .60;
        } else if (size == Sandwich.SandwichSize.TWELVEINCH) {
            price = 2.25;
            if (hasExtra) price += .90;
        }

        return price;
    }

    public enum TypeOfCheese{
        AMERICAN,
        PROVOLONE,
        CHEDDAR,
        SWISS
    }

}
