package com.company;

import java.util.Scanner;

public class TriangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A: ");
        int sideA = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side B: ");
        int sideB = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side C: ");
        int sideC = Integer.parseInt(scanner.nextLine());


        if (sideA == sideB && sideA == sideC) {
            System.out.println("Equilateral Triangle:");
        } else if (sideA != sideB && sideA == sideC) {
            System.out.println("Isosceles triangle");
        } else if (sideA != sideC && sideA == sideB) {
            System.out.println("Isosceles triangle");
        } else if (sideA != sideB && sideB == sideC) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle5");
        }
    }
}
/*
Напишете програма, която приема трите страни на един триъгълник: sideA, sideB и sideC.
Програмата трябва да принтира дали триъгълника е равнобедрен, равностранен или разностранен.
 */