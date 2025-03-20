
package com.muntaha.oddsquaresseries;
import java.util.Scanner;

public class OddSquaresSeries {
    public static void main(String[] args) {
        // Take input for the number of terms
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input for the number of terms
            System.out.print("Enter the number of terms (n): ");
            int n = scanner.nextInt();
            
            int sum = 0; // Initialize sum
            
            // Loop to calculate the sum of squares of odd numbers
            for (int i = 1; i <= n; i++) {
                int oddNumber = 2 * i - 1; // Generate the odd number
                sum += oddNumber * oddNumber; // Add its square to the sum
            }
            
            // Display the result
            System.out.println("Sum of the series: " + sum);
        }
    }
}