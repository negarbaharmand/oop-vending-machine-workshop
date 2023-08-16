package org.example.model;

public class Snack extends Product {
    private boolean isVegan;


    public Snack(double price, String productName, boolean isVegan) {
        super(price, productName);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public String examine() {
        return "This is " + (isVegan ? "a vegan" : "not a vegan") + " snack called " + getProductName() + " costing $" + getPrice();

    }

    @Override
    public String use() {
        return "Enjoy your snack!";

    }
}
