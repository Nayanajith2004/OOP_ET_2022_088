package LW_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int integer= scanner.nextInt();
        Method_Q2 methodQ2 =new Method_Q2();
        for(int i=1;integer>=0;i++){
            System.out.println("it has "+methodQ2.setInteger(integer));
            System.out.println("Enter a integer: ");
            int num= scanner.nextInt();
            integer=num;
        }
        System.out.println("Enter a positive integer.");
    }
}
