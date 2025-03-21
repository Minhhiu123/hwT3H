package Lec7.Bai1;

import java.util.Scanner;

abstract class Animal {
     protected String name;
     protected int age;
     protected String species;
     protected String color;
     public Animal(String name, int age, String species, String color) {
         this.name = name;
         this.age = age;
         this.species = species;
         this.color = color;
     }
     public abstract void makeSound();
     public void displayInfo(){
         System.out.println("Name: " + name);
         System.out.println(" Age: " + age + " Species: " + species + " Color: " + color);
     }
     public void inputInfo(Scanner scanner){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter name: ");
         this.name = sc.nextLine();
         System.out.print("Enter age: ");
         this.age = sc.nextInt();
         System.out.println("Enter species: ");
         this.species = sc.nextLine();
         System.out.print("Enter color: ");
         this.color = sc.nextLine();
     }
}
