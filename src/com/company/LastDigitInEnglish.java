package com.company;

import java.util.Scanner;

public class LastDigitInEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String digitAsWord = "";

        switch (lastDigit) {
            case 0:
                digitAsWord = "Your last digit is zero";
                break;
            case 1:
                digitAsWord = "Your last digit is one";
                break;
            case 2:
                digitAsWord = "Your last digit is two";
                break;
            case 3:
                digitAsWord = "Your last digit is three";
                break;
            case 4:
                digitAsWord = "Your last digit is four";
                break;
            case 5:
                digitAsWord = "Your last digit is five";
                break;
            case 6:
                digitAsWord = "Your last digit is six";
                break;
            case 7:
                digitAsWord = "Your last digit is seven";
                break;
            case 8:
                digitAsWord = "Your last digit is eight";
                break;
            case 9:
                digitAsWord = "Your last digit is nine";
                break;
            default:
                digitAsWord = "unknown";
                break;
        }
        System.out.println(digitAsWord);



    }
}
    /*
Напишете програма, която при въведено число, изписва последната му цифра (цифрата на десетиците) на английски език.
     */

