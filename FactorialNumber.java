
package com.muntaha.factorialnumber;
import java.util.Scanner;

public class FactorialNumber{
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Take input for the number
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input for the number
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            
            // Display the result
            System.out.println("Factorial of " + n + " is: " + factorial(n));
        }
    }
}