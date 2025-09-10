package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter your First Name: ");
        Scanner scanner =new Scanner(System.in);
        String Fname = scanner.next();
        System.out.println("Enter your Middle Name: ");
        String Mname = scanner.next();
        System.out.println("Enter your Last Name: ");
        String Lname = scanner.next();
        System.out.println(Lname+", "+Fname+" "+Mname.substring(0,1));
    }
}
