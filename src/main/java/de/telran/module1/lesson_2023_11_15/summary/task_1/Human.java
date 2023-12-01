package de.telran.module1.lesson_2023_11_15.summary.task_1;

public class Human extends Earthling{
    protected String name;

    public Human(int age, String name) {
        super(age);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", name=" + name;
    }
}
