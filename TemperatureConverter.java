
package com.muntaha.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Taking user input
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            
            // Conversion formula
            double celsius = (fahrenheit - 32) * 5 / 9;
            
            // Displaying the result
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
    }
}