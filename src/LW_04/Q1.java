package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int smallest=A;
        if (B<smallest) {
            smallest = B;
        }
        if (C<smallest){
            smallest=C;
        }
        System.out.println("the smallest no you entered is : "+smallest);
    }
}
