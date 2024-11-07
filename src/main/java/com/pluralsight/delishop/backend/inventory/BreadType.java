package com.pluralsight.delishop.backend.inventory;

public enum BreadType {
    WHITE("White"),
    WHEAT("Wheat"),
    RYE("Rye"),
    WRAP("Wrap");

    String type;
    BreadType(String type){
        this.type = type;
    }
}
