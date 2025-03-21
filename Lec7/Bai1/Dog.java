package Lec7.Bai1;

import java.util.Scanner;

class Dog extends Animal {
    private String breed;

    public Dog() {
        super("", 0, "Dog", "");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        System.out.println("Enter breed: ");
        breed = scanner.nextLine().trim();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
