package Lec6.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Elephant());
        animals.add(new Monkey());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.action();
            System.out.println();
        }
    }
}
