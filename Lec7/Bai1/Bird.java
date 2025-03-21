package Lec7.Bai1;

import java.util.Scanner;

class Bird extends Animal {
    private int wingSpan;

    public Bird() {
        super("", 0, "Bird", "");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet! Tweet!");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Winging Span" );
    }

    public void fly() {
        System.out.println(name + " is flying with a wingspan");
    }
}
