package Lec6.Bai3;

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird is chirping.");
    }

    @Override
    void action() {
        System.out.println("The bird is flying.");
    }
}

