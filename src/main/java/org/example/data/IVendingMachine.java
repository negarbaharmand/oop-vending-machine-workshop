package org.example.data;

import org.example.model.Product;

public interface IVendingMachine {

    void addCurrency(int amount);

    int getBalance();

    Product request(String id);


    int endSession();

    String getDescription(String id);

    String[] getProducts();


}
