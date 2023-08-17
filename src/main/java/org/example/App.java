package org.example;

import org.example.data.VendingMachineIca;
import org.example.model.ChocolateBar;
import org.example.model.Drink;
import org.example.model.Product;
import org.example.model.Snack;


public class App {
    public static void main(String[] args) {
        Snack nuts = new Snack(12, "nuts", true);
        System.out.println(nuts.examine());
        Drink coke = new Drink(20, "Coke", "carbonated");
        ChocolateBar snickers = new ChocolateBar(8, "Snickers", 50);
        Product[] products = new Product[]{nuts, snickers};
        VendingMachineIca vendingMachine = new VendingMachineIca(products);
        vendingMachine.addCurrency(100);
        vendingMachine.addCurrency(5);
        vendingMachine.request(nuts.getId());
        int balance = vendingMachine.getBalance();
        System.out.println("Current balance: " + balance);
        vendingMachine.getDescription(coke.getId());
        vendingMachine.endSession();

    }
}