package de.telran.module1.lecture_08_11.task_1;

public class Person {
    private String fullName;
    private int age;

    public Person() {}
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Name: "+ this.fullName);
        System.out.println("age: " + this.age);
        System.out.println("go walk");
    }
    public void talk(){
        System.out.println("Name: "+ this.fullName);
        System.out.println("age: " + this.age);
        System.out.println("say: Hello!");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
