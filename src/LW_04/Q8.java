package LW_04;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N =scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i+" * "+ N +" = "+(i*N));
        }
    }
}
