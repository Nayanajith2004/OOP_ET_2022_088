package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("enter the menu category: ");
        Scanner scanner= new Scanner(System.in);
        String category = scanner.next();
        if (category.equals("Entree")){
            System.out.println("$1.99 Tofu Burger \n$1.90 Cajun Chicken\n$2.49 Buffalo Wings\n$2.49 Rainbow Fillet ");
        } else if (category.equals("side dish")) {
            System.out.println("$3.49  Rice Cracker\n$4.59  No-Salt Fries \n$3.99  Zucchini  \n$2.99  Brown Rice");
        }else {
            System.out.println("$0.79  Cafe Mocha\n$0.69  Cafe Latte\n$1.09  Espresso \n$0.59  Oolong Tea");


        }
    }
}
