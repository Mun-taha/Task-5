package com.muntaha.leapyear;

import java.util.Scanner; // Import Scanner class for user input

public class LeapYear {
    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in) // Create a Scanner object to take input
        ) {
            // Ask the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt(); // Read the user input as an integer
            // Checking if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            // Close the scanner to prevent resource leak
        }
    }
}