package de.telran.module1.summary.task_1;

public class Earthling {
    protected int age;

    public Earthling( int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Earthling:\n" +
                "age=" + age;
    }
}
