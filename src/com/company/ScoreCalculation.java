package com.company;

import java.util.Scanner;

public class ScoreCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your points: ");
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (points >= 0 && points <= 1000) {
            if (points >= 10 && points <= 100) {
                bonusPoints = points * 1.1;
            } else if (points >= 101 && points <= 200) {
                bonusPoints = points + 25;
            } else if (points >= 201 && points <= 300) {
                bonusPoints = points + points * 2;
            } else if (points >= 301 && points <= 400) {
                bonusPoints = points + points * 3;
            } else if (points >= 401 && points <= 600) {
                bonusPoints = points + points * 4.5;
            } else if (points >= 601 && points <= 1000) {
                bonusPoints = points + points * 6;
            }
            if (bonusPoints % 2 != 0) {
                bonusPoints = bonusPoints + 5;
            }
            System.out.println("Your points: " + points);
            System.out.println("Your bonus points are: " + (bonusPoints - points));
            System.out.println("Your final points are: " + bonusPoints);
        } else {
            System.out.println("Try again.");
        }

    }
}
/*
Напишете програма, която приема число, представляващо брой точки.
Програмата добавя бонус точки, спрямо следните правила:

ако числото е между 10 и 100, бонус точките са 10% от числото;
ако числото е между 101 и 200, бонус точките са 25;
ако числото е между 201 и 300 умножава точките по 2;
ако числото е между 301 и 400 умножава точките по 3;
ако числото е между 401 и 600 умножава точките по 4.5;
ако числото е между 601 и 1000 умножава точките по 6.
Ако въведените точки са извън интервала [0 … 1000] програмата трябва да принтира съобщение за грешка.

Ако стойността на точките (след добавянето на бонуса) е нечетно число, програмата добавя още 5 бонус точки.
 */
