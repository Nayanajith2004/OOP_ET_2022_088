package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the power of 10: ");
        int power = scanner.nextInt();
        switch (power){
            case 6:{
                System.out.println("Million");
                break;
            }
            case 9:{
                System.out.println("Billion");
                break;
            }
            case 12: {
                System.out.println("Trillion");
                break;
            }
            case 15:{
                System.out.println("Quadrillion");
                break;
            }
            case 18:{
                System.out.println("Quantillion");
                break;
            }
            case 21:{
                System.out.println("sextillion");
                break;
            }
            case 30:{
                System.out.println("Nonillion");
                break;
            }
            case 100:{
                System.out.println("Google");
                break;
            }
            default:{
                System.out.println("invalid input");
                break;
            }


        }


    }
}
