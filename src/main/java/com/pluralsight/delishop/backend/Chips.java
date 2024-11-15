package com.pluralsight.delishop.backend;

public class Chips implements Product {
    private String name;


    public Chips(String name) {
        this.name = name;
    }


    @Override
    public double getPrice() {
        return 1.50;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append("&nbsp".repeat(90));
        sb.append(String.format("$%.2f <br>", getPrice()));
        return sb.toString();
    }

    @Override
    public String toCSVString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append(String.format("     $%.2f \n", getPrice()));


        return sb.toString();
    }
}
