package com.company;

import java.util.Scanner;

public class LetterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter: ");
        String text = scanner.nextLine();
        char symbol = text.charAt(0);
        boolean isLetter = symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122;

        if (isLetter) {
            if (symbol == 65 || symbol == 97 || symbol == 69 || symbol == 101 || symbol == 73 || symbol == 105 || symbol == 79 || symbol == 111 || symbol == 85 || symbol == 117 || symbol == 89 || symbol == 121) {
                System.out.println("Your letter is vowel.");
            } else {
                System.out.println("Your letter is not vowel.");
            }
        } else {
            System.out.println("Try again and enter a letter.");
        }
    }
}
/*
Напишете програма, която приема един символ - symbol.

Ако символът не е буква от латинската азбука, да се принтира: Invalid input!.
Ако символът е буква от латинската азбука, да се принтира дали е гласна или съгласна.
 */