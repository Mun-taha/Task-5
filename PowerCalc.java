
package com.muntaha.powercalc;

import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        // Take input for base and exponent
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input for base and exponent
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            int exponent = scanner.nextInt();
            
            double result = 1; // Initialize result
            
            // Loop to calculate power
            for (int i = 1; i <= Math.abs(exponent); i++) {
                result *= base;
            }
            
            // If exponent is negative, take reciprocal
            if (exponent < 0) {
                result = 1 / result;
            }
            
            // Display the result
            System.out.println(base + "^" + exponent + " = " + result);
        }
    }
}