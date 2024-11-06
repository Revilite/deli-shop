package com.pluralsight.delishop.backend;

public abstract class Addon extends Product{

    public Addon(double totalPrice, String name, int id) {
        super(totalPrice, name, id);
    }
}
