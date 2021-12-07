package com.company;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the third number:");
        double c = Double.parseDouble(scanner.nextLine());

        if (a > b && a > c) {
            System.out.println(a + " is the biggest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest number.");
        } else {
            System.out.println(c + " is the biggest number.");
        }
    }
}
/*
Напишете програма, която приема 3 реални числа и принтира най-голямото от тях.
 */