package com.company;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            System.out.println("You are " + age + " so you are under 18.");
        } else {
            System.out.println("You are " + age + " so you are over 18");
        }

    }
}
    /*
Напишете програма, която приема възрастта на потребителя и изписва дали потребителят е под 18 години или над 18 години.
     */
