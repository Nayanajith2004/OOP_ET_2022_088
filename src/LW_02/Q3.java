package LW_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int array1[]=new int[5];
         for(int i =0;i<5;i++){
             System.out.println("Enter number "+(i+1));
             array1[i] =scanner.nextInt();
         }
        int num=array1[0];
         for(int k=1;k<5;k++){
             if (num<array1[k]){
                 num=array1[k];
             }
         }
         array1[0]=num;
        ArrayList list = new ArrayList<>();
         list.remove(array1[0]);
        System.out.println(array1);

    }
}
