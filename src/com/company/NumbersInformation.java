package com.company;

import java.util.Scanner;

public class NumbersInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your second number:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your third number:");
        int c = Integer.parseInt(scanner.nextLine());

        int smallest ;
        int biggest;
        int sum = a+b+c;
        int multiplication = a*b*c;

        if (a>b){
            if (a>c){
                biggest = a;
                smallest = Math.min(b, c);
            } else {
                biggest = c;
                smallest = b;
            }
        } else {
            if(b>c){
                biggest = b;
                smallest = Math.min(c, a);
            } else {
                smallest = a;
                biggest = c;
            }

        }
        System.out.println("The smallest number is: "+ smallest);
        System.out.println("The biggest number is: " + biggest);
        System.out.println(a + " + " + b + " + " + c + " = " + sum );
        System.out.println(a + " * " + b + " * " + c + " = " + multiplication);


    }
}
/*
Напишете програма, която приема 3 цели числа.
Програмата трябва да извежда:

най-малкото число;
най-голямото число;
сумата на 3-те числа;
произведението на 3-те числа.
 */