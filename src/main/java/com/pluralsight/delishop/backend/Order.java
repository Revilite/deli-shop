package com.pluralsight.delishop.backend;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> items;
    private double totalPrice;

    public Order() {
    totalPrice = 0;
    items = new ArrayList<>();
    }

    public void addItem(Product item){
        items.add(item);
    }

    public Order printOrder() {
        return this;
    }
    public double getTotalPrice(){
        for(Product item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
