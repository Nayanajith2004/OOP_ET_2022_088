package LW_03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius : ");
        double celsius =scanner.nextDouble();
        Temperature temperature=new Temperature(celsius);
        temperature.setFahrenheit();
        System.out.println(celsius+"degree celsius is "+ temperature.toFahrenheit()+"Fahrenheit");

    }
}
