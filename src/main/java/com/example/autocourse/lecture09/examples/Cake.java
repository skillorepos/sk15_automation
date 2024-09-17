package com.example.autocourse.lecture09.examples;

public class Cake {
    // Class attributes
    String flavor;
    int layers;
    double price;

    // No-argument constructor
    public Cake() {
        this.flavor = "Vanilla";
        this.layers = 2;
        this.price = 20.0;
    }

    // Parameterized constructor
    public Cake(String flavor, int layers, double price) {
        this.flavor = flavor;
        this.layers = layers;
        this.price = price;
    }

    // Method to print cake details
    public void printDetails() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Layers: " + layers);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total price including a given tax rate
    public double calculateTotalPrice(double taxRate) {
        if (taxRate < 0) {
            System.out.println("Invalid tax rate.");
            return price; // Return the original price if tax rate is invalid
        }
        double taxAmount = price * taxRate / 100;
        return price + taxAmount;
    }
}
