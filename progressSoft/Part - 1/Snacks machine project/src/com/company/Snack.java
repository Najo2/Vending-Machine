package com.company;

import java.util.Scanner;

public class Snack {
    String[] soda = {"Pepsi", "7'Up", "Merinda"};
    String[] choco = {"Galaxy", "Mars", "Twix"};
    String[] gum = {"Extra", "Excellent", "Bubble Gum"};
    String[] chips = {"Lays", "Doritos", "Mr.Chips"};

    static Money money = new Money();
    SnackType snackType = new SnackType();



    int printCategoryWithPrice(int category){
        Scanner cat = new Scanner(System.in);

        while (category > 4 || category <= 0){
            System.out.println("Please enter a correct index number");
            snackType.chooseSnackType();
            category = cat.nextInt();
        }

        int choice = 0;
        boolean finish = true;

        switch (category){
            case 1:
                System.out.println("Select from below:\n");
                while (finish) {
                    for (int i = 0; i < soda.length; i++) {
                        System.out.println((i + 1) + "." + soda[i]);
                    }
                    System.out.println("Price   =>    " + money.sodaPrice + " JD");
                    choice = cat.nextInt();
                    if (choice > 3 || choice <= 0)
                        System.out.println("Please enter an index from below:");
                    else
                        finish = false;
                }

                break;

            case 2:
                System.out.println("Select from below:\n");
                while (finish) {
                    for (int i = 0; i < choco.length; i++) {
                        System.out.println((i + 1) + "." + choco[i]);
                    }
                    System.out.println("Price   =>    " + money.chocoPrice + " JD");
                    choice = cat.nextInt();
                    if (choice > 3 || choice <= 0)
                        System.out.println("Please enter an index from below:");
                    else
                        finish = false;
                }
                break;

            case 3:
                System.out.println("Select from below:\n");
                while (finish) {
                    for (int i = 0; i < gum.length; i++) {
                        System.out.println((i + 1) + "." + gum[i]);
                    }
                    System.out.println("Price   =>    " + money.gumPrice + " JD");
                    choice = cat.nextInt();
                    if (choice > 3 || choice <= 0)
                        System.out.println("Please enter an index from below:");
                    else
                        finish = false;
                }
                break;

            case 4:
                System.out.println("Select from below:\n");
                while (finish) {
                    for (int i = 0; i < chips.length; i++) {
                        System.out.println((i + 1) + "." + chips[i]);
                    }
                    System.out.println("Price   =>    " + money.chipsPrice + " JD");
                    choice = cat.nextInt();
                    if (choice > 3 || choice <= 0)
                        System.out.println("Please enter an index from below:");
                    else
                        finish = false;
                }
                break;
        }
        return choice;
    }

}
