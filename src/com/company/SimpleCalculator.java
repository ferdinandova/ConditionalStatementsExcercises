package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the operation: ");
        char operation = scanner.next().charAt(0);
        double result;

        if (operation == '+') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber  + " = " + result);
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else if (operation == '^') {
            result = (int)firstNumber ^ (int)secondNumber;
            System.out.println(firstNumber  + " ^ " + secondNumber + " = " + result);
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + result);
        } else {
            System.out.println("Invalid operation. Try again.");
        }
    }
}
/*
Напишете програма, която приема две числа и един символ. Символът представлява аритметична операция: +, -, * или /.
Програмата трябва да изпълнява съответната аритметична операция, използвайки двете числа.
Може да разширите условието като добавите и други операции: ^ (повдигане на степен), % (взимане на остатък при деление), …
 */