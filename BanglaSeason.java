package com.muntaha.banglaseason;

import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        // Take input for the month (1-12)
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input for the month (1-12)
            System.out.print("Enter a month number (1-12): ");
            int month = scanner.nextInt();
            
            String season;
            
            // Switch case to determine Bangla season
            season = switch (month) {
                case 4, 5 -> "(Summer)";
                case 6, 7 -> "(Rainy)";
                case 8, 9 -> "(Autumn)";
                case 10, 11 -> "(Late Autumn)";
                case 12, 1 -> "(Winter)";
                case 2, 3 -> "(Spring)";
                default -> "Invalid month! Please enter a number between 1 and 12.";
            }; // April, May (Boishakh, Joishtho)
            // June, July (Asharh, Srabon)
            // August, September (Bhadro, Ashwin)
            // October, November (Kartik, Ogrohayon)
            // December, January (Poush, Magh)
            // February, March (Falgun, Choitro)
            
            // Display the result
            System.out.println("Bangla Season: " + season);
        }
    }
}