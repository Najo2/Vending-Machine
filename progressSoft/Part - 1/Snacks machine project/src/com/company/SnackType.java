package com.company;

import java.util.Scanner;

public class SnackType {
    // Snacks categories
    private String soda = "Soda";
    private String choco = "Chocolate";
    private String gum = "Gum";
    private String chips = "Chips";

    static int sodaQuantity = 10;
    static int chocoQuantity = 10;
    static int gumQuantity = 10;
    static int chipsQuantity = 10;


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

    // Checking quantities depends on the category
    void checkQuantity(int choice){

        if(choice == 1) {
            if (sodaQuantity == 0)
                quantityIsOut(soda);
        }
        else if(choice == 2){
            if (chocoQuantity == 0)
                quantityIsOut(choco);
        }
        else if (choice == 3){
            if (gumQuantity == 0)
                quantityIsOut(gum);
        }
        else{
            if (chipsQuantity == 0)
                quantityIsOut(chips);
        }

    }

    // Finishing because insufficient quantity
    void quantityIsOut(String category){
        System.out.println("I'm sorry, but I'm out of " + category +"...\nPlease try again");
        System.exit(0);
    }

}
