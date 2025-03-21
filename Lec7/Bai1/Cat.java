package Lec7.Bai1;

import java.util.Scanner;

class Cat extends Animal {
    private String breed;

    public Cat() {
        super("", 0, "Cat", "");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        System.out.println("Breed: " + breed);

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);

    }
}
