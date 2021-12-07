package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter c: ");
        double c = Double.parseDouble(scanner.nextLine());

        double x1;
        double x2;

        double dDiscriminant = b * b - (4 * a * c);

        if (dDiscriminant > 0) {
            System.out.println("Discriminant is bigger than 0; 2 real roots.");
            x1 = (-b + Math.sqrt(dDiscriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(dDiscriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (dDiscriminant == 0) {
            System.out.println("Discriminant is equal to 0; 1 real root.");
            x1 = b / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Discriminant is smaller then. No real roots.");
        }
    }
}
/*
Напишете програма, която решава квадратно уравнение. Програмата трябва да приема 3 реални числа: a, b и c.
 */