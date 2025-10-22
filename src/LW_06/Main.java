package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("enter the name: ");
            String name= scanner.next();
            if (name.equals("stop")){
                break;
            }
            Pet pet;
            System.out.println("Enter the type: ");
            String type = scanner.next();
            if (type.equals("c")){
                pet= new Cat();
            }else {
                pet=new Dog();
            }
            pet.setName(name);
            pets.add(pet);

        }
        System.out.println("Pets List: ");
        for (Pet pet:pets){
            String type=(pet instanceof Dog)? "Dog":"cat";
            System.out.println("pet name: "+pet.getName()+" "+"Type: "+type);
        }

    }

}
