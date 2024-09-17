package com.example.autocourse.lecture09.examples;

public class Examples {
    public static void main(String[] args) {
        demoConstructors();
    }

    public static void demoObjectCreation() {
        Cake chocolateCake = new Cake();
        System.out.println(chocolateCake);

        Cake oreoCake = new Cake();
        System.out.println(oreoCake);
    }

    public static void demoClassAttributes() {
        // Creating a Cake object
        Cake birthdayCake = new Cake();

        // Setting initial values
        birthdayCake.flavor = "Chocolate";
        birthdayCake.layers = 3;
        birthdayCake.price = 25.50;

        // Display initial values
        System.out.println("Initial Cake Details:");
        System.out.println("Flavor: " + birthdayCake.flavor); // Outputs: Flavor: Chocolate
        System.out.println("Layers: " + birthdayCake.layers); // Outputs: Layers: 3
        System.out.println("Price: $" + birthdayCake.price); // Outputs: Price: $25.50

        // Modifying values
        birthdayCake.flavor = "Vanilla";
        birthdayCake.layers = 4;
        birthdayCake.price = 30.75;

        // Display modified values
        System.out.println("Modified Cake Details:");
        System.out.println("Flavor: " + birthdayCake.flavor); // Outputs: Flavor: Vanilla
        System.out.println("Layers: " + birthdayCake.layers); // Outputs: Layers: 4
        System.out.println("Price: $" + birthdayCake.price); // Outputs: Price: $30.75
    }

    public static void demoClassMethods() {
        Cake birthdayCake = new Cake();

        // Setting initial values
        birthdayCake.flavor = "Chocolate";
        birthdayCake.layers = 3;
        birthdayCake.price = 25.50;

        // Print initial details
        birthdayCake.printDetails();

        // Calculate and print total price including tax
        double taxRate = 8.5; // 8.5% tax rate
        double totalPrice = birthdayCake.calculateTotalPrice(taxRate);
        System.out.println("Total Price with " + taxRate + "% tax: $" + totalPrice);
    }

    public static void demoConstructors() {
        // Create a Cake object using the no-argument constructor
        Cake defaultCake = new Cake();
        System.out.println("Default Cake Details:");
        defaultCake.printDetails();

        // Create a Cake object using the parameterized constructor
        Cake customCake = new Cake("Chocolate", 3, 30.0);
        System.out.println("\nCustom Cake Details:");
        customCake.printDetails();

        // Create a Cake object using the parameterized constructor
        Cake oreoCake = new Cake("Oreo", 2, 25.3);
        System.out.println("\nOreo Cake Details:");
        customCake.printDetails();
    }
}
