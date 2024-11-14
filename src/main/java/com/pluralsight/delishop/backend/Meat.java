package com.pluralsight.delishop.backend;


public class Meat extends PremiumTopping {
    protected Meat.TypeOfMeat typeOfMeat;

    public Meat(Meat.TypeOfMeat typeOfMeat, Sandwich.SandwichSize size, boolean hasExtra) {
        super(hasExtra, size);
        this.typeOfMeat = typeOfMeat;
    }

    public Meat.TypeOfMeat getTypeOfMeat() {
        return typeOfMeat;
    }

    @Override
    public double getPrice() {
        if (size == Sandwich.SandwichSize.FOURINCH) {
            price = 1;
            if (hasExtra) price += .50;
        } else if (size == Sandwich.SandwichSize.EIGHTINCH) {
            price = 1.5;
            if (hasExtra) price += 1;
        } else if (size == Sandwich.SandwichSize.TWELVEINCH) {
            price = 2;
            if (hasExtra) price += 1.50;
        }

        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(typeOfMeat.toString().substring(0, 1) + typeOfMeat.toString().substring(1, typeOfMeat.toString().length()).toLowerCase());

        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }
        sb.append(String.format("$%.2f", getPrice()));

        return sb.toString();
    }

    public enum TypeOfMeat {
        STEAK,
        HAM,
        SALAMI,
        ROAST_BEEF,
        CHICKEN,
        BACON;
    }
}
