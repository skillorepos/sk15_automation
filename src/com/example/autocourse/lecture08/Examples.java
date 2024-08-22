package com.example.autocourse.lecture08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        prepareMeal();
    }

    public static void printGreeting() {
        System.out.println("Hello, welcome!");
    }

    public static void displayDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
    }

    /**
     * Demo method calling another method
     */
    // Method that coordinates the meal preparation
    public static void prepareMeal() {
        String mainDish = cookMainDish();
        String sideDish = prepareSideDish();
        System.out.println("Serving the meal...");
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Meal served successfully!");
    }

    // Method to get and "cook" the main dish
    public static String cookMainDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main dish you want to cook: ");
        String mainDish = scanner.nextLine();
        System.out.println("Cooking the main dish: " + mainDish);
        return mainDish;
    }

    // Method to get and "prepare" the side dish
    public static String prepareSideDish() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side dish you want to prepare: ");
        String sideDish = scanner.nextLine();
        System.out.println("Preparing the side dish: " + sideDish);
        return sideDish;
    }

    /**
     * Demo methods with parameters
     */
    // Method that takes an int parameter and prints its square
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);
    }

    // Method that takes a long parameter and prints its double
    public static void printDouble(long number) {
        long doubled = number * 2;
        System.out.println("Double of " + number + " is: " + doubled);
    }

    // Method that takes a double parameter and prints its half
    public static void printHalf(double number) {
        double half = number / 2;
        System.out.println("Half of " + number + " is: " + half);
    }

    // Method that takes a boolean parameter and prints a decision
    public static void printDecision(boolean decision) {
        if (decision) {
            System.out.println("You chose yes.");
        } else {
            System.out.println("You chose no.");
        }
    }

    // Method that takes a char parameter and prints the next character in the alphabet
    public static void printNextChar(char letter) {
        char nextLetter = (char) (letter + 1);
        System.out.println("The next character after '" + letter + "' is: '" + nextLetter + "'");
    }

    // Method that takes three int parameters and prints their sum
    public static void printSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);
    }

    // Method that takes a String, an int, and a boolean as parameters
    public static void printPersonInfo(String name, int age, boolean isStudent) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + (isStudent ? "Yes" : "No"));
    }

    // Method that finds the largest number and removes it from the ArrayList
    public static void removeLargestNumber(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return; // Do nothing if the list is empty
        }

        // Initialize the largest number with the first element
        Integer largest = list.get(0);

        // Find the largest number in the list
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }

        // Remove the largest number from the list
        list.remove(largest);
    }


    /**
     * Demo return type
     */
    // Method to calculate the sum of two numbers
    public static int calculateSum(int x, int y) {
        return x + y;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Demo method overloading
     */
    // Method with two int parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with three int parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public ArrayList<String> findMissingWords(String text, String[] wordsArray) {
        ArrayList<String> missingWords = new ArrayList<>();
        // Convert the text to lowercase for case-insensitive comparison
        String lowerCaseText = text.toLowerCase();
        // Check if each word is in the text
        for (String word : wordsArray) {
            if (!lowerCaseText.contains(word.toLowerCase())) {
                missingWords.add(word); // Add the missing word to the list
            }
        }
        return missingWords; // Return the list of missing words
    }
}
