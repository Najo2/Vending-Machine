package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Money {
    // Supported coins deceleration
    final static double ZERO = 0.0;
    final static double QUARTER_DINAR = 0.25;
    final static double HALF_DINAR = 0.5;
    final static double DINAR = 1.0;
    final static double FIVE_DINAR = 5.0;
    final static double TEN_DINAR = 10.0;

    static double totalMoneyInMachine = 0;

    static double sodaPrice = HALF_DINAR - 0.15;
    static double chocoPrice = HALF_DINAR;
    static double gumPrice = HALF_DINAR - 0.15;
    static double chipsPrice = HALF_DINAR - 0.2;

     private double customerChange = 0;

     SnackType snackType = new SnackType();

    // Getting the total amount of money inserted
    double insertMoney(){
        System.out.println("Please insert one coin at a time; the supported coins are 0.25 JD, 0.5 JD, 1 JD, 5 JDs and 10 JDs.\nPress 0 to finish adding process...");
        double total = MoneyInTransaction();
        return total;
    }

    // The process of continuing the insertion of money in the machine until the customer stops
    double MoneyInTransaction(){
        double total = 0;
        Scanner str = new Scanner(System.in);
        ArrayList unsupportedCoin = new ArrayList(Arrays.asList(0.01, 0.05, 0.10, 20.0, 50.0));

        while (true){
            System.out.println("Total amount inserted: " + total + " JD");
            double insertedMoney;
            while (true) {
                insertedMoney = Double.parseDouble(str.next());
                if(unsupportedCoin.indexOf(insertedMoney) >= 0 || insertedMoney < 0)
                System.out.println("please insert a supported coin; the supported coins are 0.25 JD, 0.5 JD, 1 JD, 5 JDs and 10 JDs.");
                else
                    break;
            }
            total += insertedMoney;
            if(insertedMoney == 0)
                break;
        }
        return total;
    }

    // Checking the category that has been chosen by the customer, and check the total amount of money inserted in the machine
    void checkChoiceAndPrice(int choice){
        double total;
        while (true){
            total = insertMoney();
            if(total < 0.25) {
                System.out.println("Insert at least 0.25 JD...");
            }else
                break;
        }
        if(choice == 1){
            priceCheck(total, sodaPrice);
            snackType.sodaQuantity--;
        }

        else if(choice == 2) {
            priceCheck(total, chocoPrice);
            snackType.sodaQuantity--;
        }
        else if (choice == 3) {
            priceCheck(total, gumPrice);
            snackType.sodaQuantity--;
        }
        else {
            priceCheck(total, chipsPrice);
            snackType.sodaQuantity--;
        }

    }

    // Comparing the price of the snack with a total amount paid
    void priceCheck(double paid, double price){
        if(paid >= price){
            customerChange = paid - price;
            System.out.println("The total amount inserted: " + paid + " JD");
            System.out.println("The snack price: " + price + " JD");
            System.out.println("The change is: " + customerChange + " JD\n");
            totalMoneyInMachine+= price;
            System.out.println("The snack has been dropped, enjoy it!\n");
        }
        else {
            System.out.println("Insufficient fund, please try again with enough amount of money");
            System.out.println("Amount inserted: " + paid + " JD");
            System.out.println("Amount required: " + price + " JD");
            System.exit(0);
        }

    }
}
