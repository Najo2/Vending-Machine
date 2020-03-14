package com.company;

import java.util.Scanner;

public class Money {
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

    double insertMoney(){
        System.out.println("Please insert one coin at a time; the supported coins are 0.25 JD, 0.5 JD, 1 JD, 5 JDs and 10 JDs.\nPress 0 to finish adding process...");
        double total = loopInsertion();
        return total;
    }

    double loopInsertion(){
        double total = 0;
        Scanner str = new Scanner(System.in);

        while (true){
            System.out.println("Total amount inserted: " + total + " JD");
            double insertedMoney = Double.parseDouble(str.next());
            total += insertedMoney;
            if(insertedMoney == 0)
                break;
        }
        return total;
    }

    void checkChoice(int choice){
        double total;
        while (true){
            total = insertMoney();
            if(total < 0.25) {
                System.out.println("Insert at least 0.25 JD...");
            }else
                break;
        }
        if(choice == 1)
            priceCheck(total, sodaPrice);

        else if(choice == 2)
            priceCheck(total, chocoPrice);

        else if (choice == 3)
            priceCheck(total, gumPrice);

        else
            priceCheck(total, chipsPrice);

    }

    void priceCheck(double paid, double price){
        if(paid >= price){
            customerChange = paid - price;
            System.out.println("The total amount inserted: " + paid + " JD");
            System.out.println("The snack price: " + price + " JD");
            System.out.println("The change is: " + customerChange + " JD\n");
            totalMoneyInMachine+= price;
            System.out.println("The snack has been dropped, enjoy it!");
        }
        else {
            System.out.println("Insufficient fund, please try again with enough amount of money");
            System.out.println("Amount inserted: " + paid + " JD");
            System.out.println("Amount required: " + price + " JD");
        }
    }
}
