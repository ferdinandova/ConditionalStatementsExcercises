package com.company;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какъв е правилният начин да създадем променлива в Java?");
        System.out.println("A: int someRandomVariable = 5;");
        System.out.println("B: char symbol = “$”;");
        System.out.println("C: float pi = 3.14;");
        System.out.println("D: int 1number = 5;");

        System.out.println("Въведи отговор: ");
        String text = scanner.nextLine();
        char answer = text.charAt(0);

        if (answer == 'a' || answer == 'A') {
            System.out.println("Your answer is correct!");
        } else {
            System.out.println("Try again.");
        }
    }
}
/*
Напишете програма, която задава въпрос на потребителя и предлага 4 възможни отговора:

“Какъв е правилният начин да създадем променлива в Java?”,
“A: int someRandomVariable = 5;”,
“B: char symbol = “$”;”,
“C: float pi = 3.14;”,
“D: int 1number = 5;”.

Потребителят трябва да може да отговори като въведе символ, съответстващ на отговора.
 */