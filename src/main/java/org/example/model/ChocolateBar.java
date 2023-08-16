package org.example.model;

public class ChocolateBar extends Product {
    private int cocoaPercentage;

    public ChocolateBar(double price, String productName, int cocoaPercentage) {
        super(price, productName);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String examine() {
        return "This is a chocolate bar called " + getProductName() + " with " + cocoaPercentage + "% cocoa, costing $" + getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your chocolate bar!";
    }
}