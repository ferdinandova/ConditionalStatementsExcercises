package com.company;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day ot week from 1-7: ");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());

        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Try again and enter a number between 1 and 7.");
        }

    }
}
/*
Напишете програма, която при въведено цяло число в интервала [1 … 7], принтира съответния ден от седмицата на английски език.
 */