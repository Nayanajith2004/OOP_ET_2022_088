package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the length in centimeters:  ");
        Scanner scanner=new Scanner(System.in);
        double centi= scanner.nextDouble();
        double inches= centi/2.54;
        int feet=(int) inches/12;
        double pInches=inches%12;
        System.out.println(feet+" feet and "+pInches+" inches");
    }
}