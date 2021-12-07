package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ProductPriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("City/town: ");
        String town = scanner.nextLine();
        System.out.println("Product: ");
        String drink = scanner.nextLine();
        double price = 0;

        switch (drink.toLowerCase(Locale.ROOT)) {
            case "coffee": {
                switch (town.toLowerCase(Locale.ROOT)) {
                    case "sofia":
                        price = 0.80;
                        break;
                    case "plovdiv":
                        price = 0.70;
                        break;
                    case "varna":
                        price = 0.60;
                        break;
                    case "burgas":
                        price = 0.40;
                        break;
                }
                break;
            }
            case "mineral water": {
                switch (town) {
                    case "sofia":
                        price = 1.10;
                        break;
                    case "plovdiv":
                        price = 1.00;
                        break;
                    case "varna":
                        price = 0.80;
                        break;
                    case "burgas":
                        price = 1.00;
                        break;
                }
                break;
            }
            case "hot chocolate": {
                switch (town) {
                    case "sofia":
                        price = 1.20;
                        break;
                    case "plovdiv":
                        price = 1.00;
                        break;
                    case "varna":
                        price = 1.40;
                        break;
                    case "burgas":
                        price = 0.70;
                        break;
                }
                break;
            }
            case "beer": {
                switch (town) {
                    case "sofia":
                        price = 1.60;
                        break;
                    case "plovdiv":
                        price = 1.50;
                        break;
                    case "varna":
                        price = 1.10;
                        break;
                    case "burgas":
                        price = 1.25;
                        break;

                }
                break;
            }
            case "energy drink": {
                switch (town) {
                    case "sofia":
                        price = 2.40;
                        break;
                    case "plovdiv":
                        price = 1.90;
                        break;
                    case "varna":
                        price = 2.50;
                        break;
                    case "burgas":
                        price = 3.00;
                        break;
                }
                break;
            }
            case "coca cola": {
                switch (town) {
                    case "sofia":
                        price = 2.20;
                        break;
                    case "plovdiv":
                        price = 1.90;
                        break;
                    case "varna":
                        price = 1.80;
                        break;
                    case "burgas":
                        price = 1.70;
                        break;
                }
            }
        }
        System.out.println(drink + " costs " + price + " in " + town);
    }
}


/*
Напишете програма, която въвежда име на продукт и име на град. Според следният ценоразпис, програмата извежда цената на продукта, спрямо града, в който се предлага.

Coffee:
Sofia - 0.80 лв
Plovdiv - 0.70 лв
Varna - 0.60 лв
Burgas - 0.40 лв
Mineral Water:
Sofia - 1.10 лв
Plovdiv - 1.00 лв
Varna - 0.80 лв
Burgas - 1.00 лв
Hot Chocolate:
Sofia - 1.20 лв
Plovdiv - 1.00 лв
Varna - 1.40 лв
Burgas - 0.70 лв
Beer:
Sofia - 1.60 лв
Plovdiv - 1.50 лв
Varna - 1.10 лв
Burgas - 1.25 лв
Energy Drink:
Sofia - 2.40 лв
Plovdiv - 1.90 лв
Varna - 2.50 лв
Burgas - 3.00 лв
Coca-Cola:
Sofia - 2.20 лв
Plovdiv - 1.90 лв
Varna - 1.80 лв
Burgas - 1.70 лв
 */