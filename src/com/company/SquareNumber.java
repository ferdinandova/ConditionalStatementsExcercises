package com.company;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        double square = Math.sqrt(number);
        System.out.println(square);

        if ((int) square * square == number) {
            System.out.println("The number is real square.");
        } else {
            System.out.println("The number is not real square.");
        }
    }
}
/*
Напишете програма, която проверява дали едно число е точен квадрат. Например числото 9 е точен квадрат, тъй като 3 × 3 = 9.
 */