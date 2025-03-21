package Lec7.Bai1;

class Zoo {
    Animal[] animals;
    private int count;
    public Zoo(int size) {
        this.animals = new Animal[size];
        this.count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        } else {
            System.out.println("Zoo is full! Cannot add more animals.");
        }
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

    public void displayAllInfo() {
        for (int i = 0; i < count; i++) {
            animals[i].displayInfo();
            System.out.println("----------------------");
        }
    }
}