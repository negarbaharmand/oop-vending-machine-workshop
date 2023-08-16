package org.example.model;

import java.util.UUID;

public abstract class Product {
    private String id;
    private double price;
    private String productName;

    public Product(double price, String productName) {
        this.id = UUID.randomUUID().toString();
        this.price = price;
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}
