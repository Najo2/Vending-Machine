package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

public class SnackMachine {

    static Money money = new Money();

    static void snackWithValueZero(){
        System.out.println("Amount of money inside the machine is " + money.totalMoneyInMachine + " JD");
    }

    void cancel(int x){
        System.out.println("Thank you for coming by... :) :)");
        if(x == 0)
            exit(0);
    }
}
