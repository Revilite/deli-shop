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
    public int getListLength(){
        return items.size();
    }
    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
