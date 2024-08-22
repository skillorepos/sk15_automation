package com.example.autocourse.lecture08;

import java.util.HashSet;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
    }

    public static double findSmallestNumber(double num1, double num2, double num3) {
        double smallestNumber = num1;

        if (smallestNumber > num2) {
            smallestNumber = num2;
        }

        if (smallestNumber > num3) {
            smallestNumber = num3;
        }

        return smallestNumber;
    }

    public static double computeAverageNumber(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void displayMiddleChar(String value) {
        int position;
        int length;

        //If the length of the string is even there will be two middle characters.
        if (value.length() % 2 == 0) {
            position = value.length() / 2 - 1;
            length = 2;

        } else {
            //If the length of the string is odd there will be one middle character.
            position = value.length() / 2;
            length = 1;
        }

        System.out.println(value.substring(position, position + length));
    }

    public static int countWords(String text) {
        text = text.trim();
        int count = 0;
        int textLength = text.length();

        if (textLength > 1) {
            count++; //After trim() the text will always start with a word

            for (int i = 1; i < textLength; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * @return the second-largest number or -1 if there is no valid one
     */
    public static int findSecondLargest(int[] numbers) {
        int secondLargest = -1; // Assume -1 if no valid second-largest number is found

        if (numbers.length < 2) {
            return secondLargest;
        }

        int largest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static int[] removeDuplicates(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        // Convert the set back to an array
        int[] uniqueArray = new int[uniqueNumbers.size()];
        int index = 0;
        for (int num : uniqueNumbers) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void displayLastCharacter(String text) {
        if (text == null || text.isEmpty()) {
            System.out.println("The string is empty; there is no last character.");
        } else {
            char lastChar = text.charAt(text.length() - 1);
            System.out.println("Last character: " + lastChar);
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPalindrome() {
        int remainder;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number ");

        int num = scanner.nextInt();

        if (num >= 0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        } else {
            System.out.println("The integer must be non-negative!");
            return false;
        }
    }


}
