package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

public class SnackMachine {

    static Money money = new Money();

    // Machine startup with zero JD inside
    static void snackWithValueZero(){
        System.out.println("Amount of money inside the machine is " + money.totalMoneyInMachine + " JD");
    }

}
