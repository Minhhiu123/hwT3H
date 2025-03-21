package Lec7.Bai1;

import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter number of animals: ");
    int numAnimals = scanner.nextInt();
    Zoo zoo = new Zoo(numAnimals);

    for (int i = 0; i < numAnimals; i++) {
        System.out.print("Enter animal type (Dog/Cat/Bird): ");
        String species = scanner.nextLine().trim().toLowerCase();
        Animal animal = null;

        switch (species) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            case "bird":
                animal = new Bird();
                break;
            default:
                System.out.println("Invalid animal type! Try again.");
                i--;
                continue;
        }

        animal.inputInfo(scanner);
        zoo.addAnimal(animal);
    }

    System.out.println("\nDisplaying all animals:");
    zoo.displayAllInfo();

    System.out.println("\nAnimals making sounds:");
    zoo.makeAllSounds();

    System.out.println("\nBirds flying:");
    for (int i = 0; i < zoo.animals.length; i++) {
        Animal animal = zoo.animals[i];
        if (animal instanceof Bird) {
            ((Bird) animal).fly();
        }
    }

    scanner.close();
}}

