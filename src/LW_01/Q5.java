package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter outer radius: ");
        double outerRadius;
        outerRadius= scanner.nextDouble();
        System.out.println("Enter inner radius: ");
        double innerRadius= scanner.nextDouble();
        Circle outercircle=new Circle(outerRadius);
        Circle innercircle=new Circle(innerRadius);
        double outercircleArea=outercircle.computeArea();
        double innercircleArea=innercircle.computeArea();
        double shededArea=outercircleArea-innercircleArea;
        System.out.println("Sheded area: "+shededArea);

        double outercircumference=outercircle.computeCircumferance();
        double innercircumference=innercircle.computeCircumferance();
        System.out.println("Circumference of outer circle: "+outercircumference);
        System.out.println("circumference of inner circle: "+innercircumference);
    }
}
