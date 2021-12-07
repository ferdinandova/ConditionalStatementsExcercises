package com.company;

import java.util.Scanner;

public class BeersPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your budget from 1 to 5 leva: ");
        double budget = Double.parseDouble(scanner.nextLine());

        double zateckyHus = 1.69;
        double budwaiser = 2.59;
        double zagorka = 1.49;
        double pirinsko = 2.19;
        double staropramen = 2.11;
        double hobgoblin = 4.59;

        if (budget >= 1 && budget <= 5) {
            if(budget>=zateckyHus){
                System.out.println("You can buy Zatecky Hus for: " + zateckyHus);
            }
            if (budget >= budwaiser) {
                System.out.println("You can buy Budwaiser for: " + budwaiser);
            }
            if (budget >= zagorka) {
                System.out.println("You can buy Zagorka for: " + zagorka);
            }
            if (budget >= pirinsko) {
                System.out.println("You can buy Pirinsko for: " + pirinsko);
            }
            if (budget >= staropramen) {
                System.out.println("You can buy Staropramen for: " + staropramen);
            }
            if (budget>= hobgoblin) {
                System.out.println("You can buy Hobgoblin for: " + hobgoblin);
            }
        }

    }
}
/*
Напишете програма, която приема едно реално число в интервала [1 … 5], което представлява нашия бюджет.

Създайте променливи, съхраняващи следния ценоразпис:

Zatecky Hus - 1.69 лв
Budweiser - 2.59 лв
Zagorka - 1.49 лв
Pirinsko - 2.19 лв
Staropramen - 2.11 лв
Hobgoblin - 4.59 лв
Програмата трябва да принтира имената и цените на тези продукти, които можем да закупим.
 */
