package org.example;

import org.example.model.Snack;


public class App {
    public static void main(String[] args) {
        Snack nuts = new Snack(12, "nuts", false);
        System.out.println(nuts.examine());

    }
}