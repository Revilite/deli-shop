package com.pluralsight.delishop.backend;


public abstract class Product {
    private double totalPrice;
    private String name;
    private int id;


    public Product(double totalPrice, String name, int id) {
        this.totalPrice = totalPrice;
        this.name = name;
        this.id = id;
    }

    public double updatePrice() {
        return 0.0;
    }
}
