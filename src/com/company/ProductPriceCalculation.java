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
            case "coffee" -> {
                switch (town.toLowerCase(Locale.ROOT)) {
                    case "sofia" -> price = 0.80;
                    case "plovdiv" -> price = 0.70;
                    case "varna" -> price = 0.60;
                    case "burgas" -> price = 0.40;
                }
                break;
            }
            case "mineral water" -> {
                price = switch (town) {
                    case "sofia" -> 1.10;
                    case "plovdiv" -> 1.00;
                    case "varna" -> 0.80;
                    case "burgas" -> 1.00;
                    default -> price;
                };
                break;
            }
            case "hot chocolate" -> {
                price = switch (town) {
                    case "sofia" -> 1.20;
                    case "plovdiv" -> 1.00;
                    case "varna" -> 1.40;
                    case "burgas" -> 0.70;
                    default -> price;
                };
            }
            case "beer" -> {
                price = switch (town) {
                    case "sofia" -> 1.60;
                    case "plovdiv" -> 1.50;
                    case "varna" -> 1.10;
                    case "burgas" -> 1.25;
                    default -> price;
                };
                break;
            }
            case "energy drink" -> {
                price = switch (town) {
                    case "sofia" -> 2.40;
                    case "plovdiv" -> 1.90;
                    case "varna" -> 2.50;
                    case "burgas" -> 3.00;
                    default -> price;
                };
                break;
            }
            case "coca cola" -> {
                price = switch (town) {
                    case "sofia" -> 2.20;
                    case "plovdiv" -> 1.90;
                    case "varna" -> 1.80;
                    case "burgas" -> 1.70;
                    default -> price;
                };
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