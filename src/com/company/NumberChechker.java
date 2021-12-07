package com.company;

import java.util.Scanner;

public class NumberChechker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        double number = Double.parseDouble(scanner.nextLine());

        if (number / (int)number == 1) {
            System.out.println("Your number is an integer.");
        } else {
            System.out.println("Your number is a rational.");
        }
    }
}
/*
Напишете програма, която записва въведено число в променлива от тип double.
Програмата трябва да проверява дали въведената стойност е реално число или цяло число.


 */