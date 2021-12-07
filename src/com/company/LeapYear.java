package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0) {
            System.out.println(year + " is leap.");
        } else {
            System.out.println(year + " is not leap.");
        }
    }
}
/*
Напишете програма, която проверява дали въведена година е високосна.
 */
