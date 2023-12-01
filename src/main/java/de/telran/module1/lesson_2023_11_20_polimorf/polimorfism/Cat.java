package de.telran.module1.lesson_2023_11_20_polimorf.polimorfism;

public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("meow meow");
    }
    public void voice(String message) {
        System.out.println(message);
    }
}
