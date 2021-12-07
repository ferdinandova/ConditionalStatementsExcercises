package com.company;

import java.util.Locale;
import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a month: ");
        String month = scanner.nextLine();

        switch (month.toLowerCase(Locale.ROOT)) {
            case "january", "march", "may", "july", "august", "october", "december" -> System.out.println(month + " has 30 days.");
            case "february" -> System.out.println(month + " has 28 days.");
            case "april", "june", "september", "november" -> System.out.println(month + " has 31 days.");
            default -> System.out.println("No information. Please try again.");
        }
    }

}
/*
Напишете програма, която приема име на месец и принтира броя дни в този месец. Приемете, че Февруари има 28 дни.
 */
