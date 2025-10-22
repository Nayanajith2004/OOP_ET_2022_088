package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
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
                Cat cat=new Cat();
                System.out.println("Enter the coatColor: ");
                String coatColor=scanner.next();
                cat.setCoatColor(coatColor);
            }else {
                pet=new Dog();
                Dog dog=new Dog();
                System.out.println("Enter the weight: ");
                double weight=scanner.nextDouble();
                dog.setWeight(weight);
            }
            pet.setName(name);
            pets.add(pet);

        }
        System.out.println("Cat List: ");
        for (Pet pet:pets){
            if(pet instanceof Cat){
                System.out.println("cat name: "+pet.getName()+"\n"+"coatcolor:"+((Cat) pet).getCoatColor());
            }
        }
        System.out.println("Dog List: ");
        for (Pet pet:pets){
            if (pet instanceof Dog){
                System.out.println("dog name: "+pet.getName()+"\n weight: "+((Dog) pet).getWeight());
            }
        }

    }

}
