package com.company;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your budget: ");
        double budget=Double.parseDouble(scanner.nextLine());
        System.out.println("Now, enter the price of your first product:");
        double firstProduct =Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the price for the second one:");
        double secondProduct = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the last price:");
        double thirdProduct = Double.parseDouble(scanner.nextLine());
        double sum = firstProduct + secondProduct + thirdProduct;
        double moneyLeft = 0;
        double moneyMore = 0;

        if (sum <= budget) {
            moneyLeft = budget - sum;
            System.out.println("You have enough money to buy these products! Money left: " + moneyLeft);
        } else {
            moneyMore = sum - budget;
            System.out.println("Unfortunately, you do not have enough money. You need more: " + moneyMore);
        }

    }
}
/*
Напишете програма, която проверява дали даден бюджет ще бъде достатъчен за закупуване на 3 продукта.
Бюджетът е реално число, което се въвежда от потребителя. След като бюджетът бъде въведен, програмата приема 3 реални числа, представляващи цени на 3 продукта.
В случай, че бюджетът е достатъчен за закупуването им, програмата трябва да принтира:
You have enough money to buy these products! Money left $<парите, които са ни останали>.
В случай, че бюджетът не е достатъчен за закупуването им, програмата трябва да принтира:
Unfortunately, you do not have enough money. You need $<парите, които не са ни достигнали> more.
 */