package com.muntaha.alternatingseries;

import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0; // Initialize sum
        
        // Loop to calculate the sum
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract even numbers
            } else {
                sum += i; // Add odd numbers
            }
        }

        // Display the result
        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }
}