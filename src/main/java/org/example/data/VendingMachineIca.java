package org.example.data;

import org.example.model.CurrencyValue;
import org.example.model.Product;

import java.util.Arrays;

public class VendingMachineIca implements IVendingMachine {

    private Product[] products;
    private int depositPool;

    public VendingMachineIca(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        for (CurrencyValue currency : CurrencyValue.values()) {
            if (currency.getValue() == amount) {
                depositPool += amount;
                return;
            }
        }
        System.out.println("Invalid currency value. Accepted values: " + Arrays.toString(CurrencyValue.values()));


    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(String id) {
        for (Product product : products) {
            if (product.getId().equals(id) && depositPool >= product.getPrice()) {
                depositPool -= product.getPrice();
                System.out.println("You successfully bought the " + product.getProductName());
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = depositPool;
        depositPool = 0;
        System.out.println("Your change is " + change);
        return change;

    }

    @Override
    public String getDescription(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product.examine();
            }
        }
        return "Product not found.";
    }

    @Override
    public String[] getProducts() {
        String[] productInfo = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            productInfo[i] = "ID: " + product.getId() + ", Name: " + product.getProductName() + ", Price: $" + product.getPrice();
        }
        return productInfo;
    }
}
