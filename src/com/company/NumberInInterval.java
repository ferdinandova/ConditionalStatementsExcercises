package com.company;

import java.util.Scanner;

public class NumberInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter m: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter x: ");
        int x = Integer.parseInt(scanner.nextLine());

        boolean isMBiggerThanN = n < m;
        boolean isXBetweenNAndM = (n < x && x <= m);

        if (isMBiggerThanN && isXBetweenNAndM) {
            System.out.println(n + " < " + x + " < " + m);
        } else {
            System.out.println("Try again.");
        }

    }
}
/*
Напишете програма, която при 3 въведени числа: n, m и x, където n < m, проверява дали x е в интервала (n … m].
 */