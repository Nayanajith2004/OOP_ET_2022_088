package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a odd length word");
        String word = Scanner.next();
        int wordLength=word.length();
        System.out.println(word.substring(wordLength/2,(wordLength/2)+1));
    }
}
