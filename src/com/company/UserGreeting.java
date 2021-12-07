package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you name: ");
        String name = scanner.nextLine();
        System.out.println("You are a female/male? ");
        String sex = scanner.nextLine();

        if (sex.equalsIgnoreCase("female")) {
            System.out.println("Hello Ms." + name);
        } else if (sex.equalsIgnoreCase("male")) {
            System.out.println("Hello Mr. " + name + "!");
        } else System.out.println("Invalid input. Try again!");
    }
}

/*
Напишете програма, която при въведени име и пол на потребителя, изписва:
Hello, Mr. <името>! или Hello, Ms. <името>!, в зависимост от пола.
 */
