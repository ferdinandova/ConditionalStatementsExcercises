package com.company;

import java.util.Scanner;

public class SymbolChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your symbol: ");
        String text = scanner.nextLine();
        char symbol = text.charAt(0);
        boolean isLetter = symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122;
        boolean isNumber = symbol >= 48 && symbol <= 57;

        if (isNumber) {
            System.out.println("You entered a number.");
        } else if (isLetter) {
            System.out.println("You entered a letter.");
        } else {
            System.out.println("You entered a symbol.");
        }
    }
}
/*
Напишете програма, която приема символ, въведен от клавиатурата, и принтира дали символът е
буква, цифра или друг символ. За целта, използвайте ASCII таблицата.
 */