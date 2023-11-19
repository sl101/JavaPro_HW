package de.telran.module1.summary.task_3;

public class Dog extends Pet {
    public Dog(String name, int age, boolean trained) {
        super(name, age, trained);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }

    public void fetchStick() {
        System.out.println("Я умею приносить палку");
    }
}