package com.pluralsight.delishop.backend;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Product item : items){
            sb.append(item.toString() + "<br>");
        }
        return sb.toString();
    }
}
