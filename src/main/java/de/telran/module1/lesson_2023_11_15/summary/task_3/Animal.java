package de.telran.module1.lesson_2023_11_15.summary.task_3;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.printf("Меня зовут %s, мой возраст %s\n", name, age);
    }
}
