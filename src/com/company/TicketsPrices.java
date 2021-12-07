package com.company;

import java.util.Scanner;

public class TicketsPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 50;
        System.out.println("Please enter you age:");
        int age = Integer.parseInt(scanner.nextLine());
        double priceDiscount;

        if (age < 16 && age <= 65) {
            priceDiscount = 0.5 * price;
            System.out.println("You are " + age + " old and your ticket costs: " + priceDiscount + ".");
        } else if (age >= 16 && age <= 24) {
            priceDiscount = 0.35 * price;
            System.out.println("You are " +age+ " old and your ticket costs: " + priceDiscount + ".");
        } else {
            System.out.println("You are " + age+ " old and your ticket costs: " + price + ".");
        }
    }
}
/*
Напишете програма, която пресмята цената на билет за преставление, при въведена възраст на зрителя.

Базовата цена на билета е 50 лв.
Ако зрителят е под 16 години използва 50% отстъпка.
Ако зрителят е между 16 и 24 години използва 35% отстъпка.
Ако зрителят е между 25 и 65 не използва отстъпка.
Ако зрителят е над 65 години отново използва 50% отстъпка.

Програмата трябва да принтира цената на билета според възрастта.
 */