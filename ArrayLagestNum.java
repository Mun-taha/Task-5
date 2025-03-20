
package com.muntaha.arraylagestnum;

public class ArrayLagestNum {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 78, 23, 89, 5, 67}; // Example array

        int max = numbers[0]; // Assume first element is the largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}