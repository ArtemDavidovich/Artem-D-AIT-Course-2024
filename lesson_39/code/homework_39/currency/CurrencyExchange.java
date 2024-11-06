package homework_39.currency;

//Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.

import java.util.Scanner;

public class CurrencyExchange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available currencies and their rates to Euro:");
        for (Currency currency : Currency.values()) {
            System.out.printf("%s: %.4f EUR%n", currency, currency.getRateToEuro());
        }

        System.out.println("\nEnter the currency code (e.g., USD, GBP, JPY):");
        String currencyCode = scanner.nextLine().toUpperCase();

        try {
            // Convert user input to Currency enum
            Currency selectedCurrency = Currency.valueOf(currencyCode);

            System.out.println("Enter the amount in " + currencyCode + ":");
            double amount = scanner.nextDouble();

            // Calculate the amount in Euros
            double amountInEuros = amount * selectedCurrency.getRateToEuro();
            System.out.printf("You will receive %.2f EUR for %.2f %s%n", amountInEuros, amount, currencyCode);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid currency code. Please make sure you entered a valid code from the list.");
        }

    }//end of main

}//end of class
