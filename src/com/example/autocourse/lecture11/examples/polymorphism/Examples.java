package com.example.autocourse.lecture11.examples.polymorphism;

public class Examples {
    public static void main(String[] args) {
        demoPolymorphism();
    }

    public static void demoPolymorphism() {
        // Creating objects of Car and Truck
        Car myCar = new Car("Toyota", "Supra", 200, 4, "Gasoline");
        Truck myTruck = new Truck("Ford", "F-150", 160, 2000);

        // Using polymorphism with Vehicle reference
        Vehicle myVehicle1 = myCar;  // Car object assigned to Vehicle reference
        Vehicle myVehicle2 = myTruck; // Truck object assigned to Vehicle reference

        // Call performMaintenance() on Car object through Vehicle reference
        myVehicle1.performMaintenance(); // This will call Car's performMaintenance() method

        // Call performMaintenance() on Truck object through Vehicle reference
        myVehicle2.performMaintenance(); // This will call Truck's performMaintenance() method

        // Display details for each vehicle
        myCar.displayDetails();  // Display details for Car
        myTruck.displayDetails();  // Display details for Truck
    }
}
