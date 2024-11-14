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
        for (int i = 0; i < 90; i++) {
            sb.append("&nbsp");
        }
        sb.append(String.format("$%.2f <br>", getPrice()));
        return sb.toString();
    }
}
