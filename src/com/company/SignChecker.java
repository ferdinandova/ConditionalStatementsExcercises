package com.company;

import java.util.Scanner;

public class SignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the third number:");
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber == 0 && secondNumber == 0 && thirdNumber == 0) {
            System.out.println(" 0 ");
        } else if (firstNumber > 0 && secondNumber > 0 && thirdNumber > 0) {
            System.out.println(" + ");
        } else if (firstNumber > 0 && secondNumber < 0 && thirdNumber < 0) {
            System.out.println(" + ");
        } else if (firstNumber < 0 && secondNumber > 0 && thirdNumber < 0) {
            System.out.println(" + ");
        } else if (firstNumber < 0 && secondNumber < 0 && thirdNumber > 0) {
            System.out.println(" + ");
        } else if (firstNumber < 0 && secondNumber < 0 && thirdNumber < 0) {
            System.out.println(" - ");
        } else if (firstNumber > 0 && secondNumber < 0 && thirdNumber > 0) {
            System.out.println(" - ");
        } else {
            System.out.println(" - ");
        }
    }
}
/*
Напишете програма, която принтира знакът (+, - или 0) на произведението на три числа без да извършва умножение.
 */