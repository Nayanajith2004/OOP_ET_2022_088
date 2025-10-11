package LW_03;

import java.util.Scanner;

public class Q1_Q2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Temperature temperature=new Temperature();
        System.out.println("Enter c to enter the temperature in Celsius or f to enter it in Fahrenheit: ");
        String type = scanner.next();
        if (type.equals("c")){
            System.out.println("Enter the temperature in celsius : ");
            double celsius=scanner.nextDouble();
            temperature.setCelsius(celsius);
            temperature.tofahrenheit();
            System.out.println("fahrenheit: "+temperature.getFahrenheit());
        } else if (type.equals("f")) {
            System.out.println("Enter the temperature in fahrenhiet: ");
            double fahrenheit=scanner.nextDouble();
            temperature.setFahrenheit(fahrenheit);
            temperature.tocelsius();
            System.out.println("Celsius: "+temperature.getCelsius());


        }
    }
}
