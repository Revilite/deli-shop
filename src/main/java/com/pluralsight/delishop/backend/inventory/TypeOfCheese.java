package com.pluralsight.delishop.backend.inventory;

public enum TypeOfCheese {
    AMERICAN("American"),
    PROVOLONE("Provolone"),
    CHEDDAR("Cheddar"),
    SWISS("Swiss");

    private String name;
    TypeOfCheese(String name){
        this.name = name;
    }
}
