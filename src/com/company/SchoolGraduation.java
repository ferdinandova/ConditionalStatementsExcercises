package com.company;

import java.util.Scanner;

public class SchoolGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade <= 6 && grade >= 5.5) {
            System.out.println("Excellent");
        } else if (grade < 5.5 && grade >= 4.5) {
            System.out.println("Very good");
        } else if (grade < 4.5 && grade >= 3.5) {
            System.out.println("Good");
        } else if (grade < 3.5 && grade >= 3) {
            System.out.println("Average");
        } else if (grade < 3 && grade >= 2) {
            System.out.println("Poor");
        } else {
            System.out.println("Try again!");
        }
    }
}
/*
Напишете програма, която при въведена оценка grade, принтира:

Отличен, ако grade е в интервала [5.5 … 6]
Много добър, ако grade е в интервала [4.5 … 5.5)
Добър, ако grade е в интервала [3.5 … 4.5)
Среден, ако grade е в интервала [3 … 3.5)
Слаб, ако grade е в интервала [2 … 3)
 */