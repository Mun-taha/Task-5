

package com.muntaha.sorternumber;
import java.util.Arrays;

public class Sorternumber {
    public static void main(String[] args) {
        int[] numbers = {42, 12, 89, 5, 33, 77}; // Example array

        Arrays.sort(numbers); // Sorting the array in ascending order

        // Printing the sorted array
        System.out.println("Sorted numbers in ascending order: " + Arrays.toString(numbers));
    }
}