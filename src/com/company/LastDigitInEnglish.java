package com.company;

import java.util.Scanner;

public class LastDigitInEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String digitAsWord = switch (lastDigit) {
            case 0 -> "Your last digit is zero";
            case 1 -> "Your last digit is one";
            case 2 -> "Your last digit is two";
            case 3 -> "Your last digit is three";
            case 4 -> "Your last digit is four";
            case 5 -> "Your last digit is five";
            case 6 -> "Your last digit is six";
            case 7 -> "Your last digit is seven";
            case 8 -> "Your last digit is eight";
            case 9 -> "Your last digit is nine";
            default -> "unknown";
        };
        System.out.println(digitAsWord);
    }
}
    /*
Напишете програма, която при въведено число, изписва последната му цифра (цифрата на десетиците) на английски език.
     */

