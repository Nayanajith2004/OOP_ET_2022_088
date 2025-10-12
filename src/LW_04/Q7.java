package LW_04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a integer value");
        int integer=scanner.nextInt();
        int count=0;
        if (integer==0){
            System.out.println("Number of digits: 1");
        }else{
            for (int i=0;integer>1;i++){
                integer/=10;
                count++;
            }
            System.out.println("No of Digits: "+count);
        }

    }
}
