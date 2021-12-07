package com.company;

import java.util.Scanner;

public class WaterDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the water degrees: ");
        double waterDegrees = Double.parseDouble(scanner.nextLine());

        if (waterDegrees == 0) {
            System.out.println(waterDegrees + " -> Ice.");
        } else if (waterDegrees >= 1 && waterDegrees <= 20) {
            System.out.println(waterDegrees + " -> Cold Water.");
        } else if (waterDegrees >= 21 && waterDegrees <= 30) {
            System.out.println(waterDegrees + " -> Normal Temperature.");
        } else if (waterDegrees >= 31 && waterDegrees <= 50) {
            System.out.println(waterDegrees + " -> Hot Water.");
        } else if (waterDegrees >= 51 && waterDegrees <= 99) {
            System.out.println(waterDegrees + " -> Very Hot Water.");
        } else if (waterDegrees == 100) {
            System.out.println(waterDegrees + " -> Boiling Water.");
        } else {
            System.out.println("Try again.");
        }

    }
}
/*
Напишете програма, която приема градусите на вода - waterDegrees. В зависимост от стойността,
да се изведе едно от следните съобщения:

Ice, ако waterDegrees е равно на 0,
Cold Water, ако waterDegrees е между 1 и 20,
Normal Temperature, ако waterDegrees е между 21 и 30,
Hot Water, ако waterDegrees е между 31 и 50,
Very Hot Water, ако waterDegrees е между 51 и 99,
Boiling Water, ако waterDegrees е равно на 100.
 */