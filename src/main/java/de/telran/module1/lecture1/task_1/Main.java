package de.telran.module1.lecture1.task_1;

public class Main {
    public static void main(String[] args) {
        initializeEmptyPerson();
        System.out.println("=======");
        initializeFullPerson();
    }
    private static void initializeFullPerson(){
        String name = "Adam";
        int age = 33;
        Person person = new Person(name, age);
        person.move();
        person.talk();
    };

    private static void initializeEmptyPerson(){
        String name = "Victor";
        int age = 20;
        Person person = new Person();
        person.setFullName(name);
        person.setAge(age);
        person.move();
        person.talk();
    };
}

