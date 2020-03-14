package com.company;

import java.util.Scanner;

public class SnackType {
    // Snacks categories
    private String soda = "Soda";
    private String choco = "Chocolate";
    private String gum = "Gum";
    private String chips = "Chips";

    // Displaying all categories for the customer and return the customer choice 
    int chooseSnackType(){
        System.out.println("Choose the snack type by pressing the index number:" + "\n1." + soda + "\n2." + choco+ "\n3." + gum+ "\n4." + chips);
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        while (index > 4 || index <= 0){
            System.out.println("Please enter a correct index number");
            System.out.println("Choose the snack type by pressing the index number:" + "\n1." + soda + "\n2." + choco+ "\n3." + gum+ "\n4." + chips);
            index = input.nextInt();
        }
        return index;
    }
}
