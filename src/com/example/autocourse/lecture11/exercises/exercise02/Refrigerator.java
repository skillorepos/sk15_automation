package com.example.autocourse.lecture11.exercises.exercise02;

public class Refrigerator extends Appliance {
    int temperature;

    public Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
        this.temperature = 0; // Default temperature
    }

    public void setTemperature(int temperature) {
        if (temperature >= -3 && temperature <= 5) {
            this.temperature = temperature;
        } else {
            this.temperature = 0;
        }
        System.out.println("Temperature set to: " + this.temperature + "°C");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Temperature: " + temperature + "°C");
    }
}