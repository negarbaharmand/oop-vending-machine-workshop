package org.example.model;

public class Drink extends Product {

    private String drinkType;

    public Drink(double price, String productName, String drinkType) {
        super(price, productName);
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }
    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }


    @Override
    public String examine() {
        return "This is a " + drinkType + " drink called " + getProductName() + " costing $" + getPrice();
    }

    @Override
    public String use() {
        return "Enjoy your " + drinkType + " drink!";
    }
}
