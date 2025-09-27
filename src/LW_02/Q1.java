package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        int x=0;
        for(int i=10;i<=49;i++){
            if(x<10){
                System.out.print(i+" ");
                x+=1;
            }
            else {
                System.out.println("\n");
                System.out.print(i+" ");
                x=1;
            }
        }

    }
}