package Lec6.Bai3;

class Monkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("Monkey is chattering.");
    }

    @Override
    void action() {
        System.out.println("The monkey is climbing trees.");
    }
}