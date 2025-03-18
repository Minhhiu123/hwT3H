package Lec6.Bai3;

class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }

    @Override
    void action() {
        System.out.println("The elephant is spraying water.");
    }
}
