package de.telran.module1.lecture_15_11.summary.task_3;

public class Main {
    public static void main(String[] args) {
        makeSound();
    }

//    Tier, Haustier, Hund, Kuh, Katze, Tiger, Löwe, Affe, Orang-Utan, Schimpanse

    private static void makeSound() {
        Animal animal = new Animal("Шарик", 5);
        Pet pet = new Pet("Бим", 5, true);
        Dog dog = new Dog("Джек", 1, false);
        pet.makeSound();
        dog.makeSound();
        dog.fetchStick();
    }

}
