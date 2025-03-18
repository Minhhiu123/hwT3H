package Lec6.Bai3;

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion is roaring.");
    }

    @Override
    void action() {
        System.out.println("The lion is hunting.");
    }
}

