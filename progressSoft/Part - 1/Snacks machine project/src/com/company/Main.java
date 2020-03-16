package com.company;

public class Main {

    public static void main(String[] args){

        SnackMachine sm = new SnackMachine();
        Money money = new Money();
        Snack snack = new Snack();
        SnackType snackType = new SnackType();

        while (true)
        {
            sm.snackWithValueZero();

        int category = snackType.chooseSnackType();

        snackType.checkQuantity(category);

        int choice = snack.printCategoryWithPrice(category);

        money.checkChoiceAndPrice(category);
        }

    }

}
