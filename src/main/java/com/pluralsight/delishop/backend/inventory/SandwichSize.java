package com.pluralsight.delishop.backend.inventory;

public enum SandwichSize {
    FOURINCH(4),
    EIGHTINCH(8),
    TWELVEINCH(12);

    private int size;
    SandwichSize(int size){
        this.size = size;
    }


}
