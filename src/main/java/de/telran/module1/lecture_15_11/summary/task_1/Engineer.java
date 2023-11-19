package de.telran.module1.lecture_15_11.summary.task_1;

public class Engineer extends Employee{
    String profession;

    public Engineer(int age, String name, int salary, String profession) {
        super(age, name, salary);
        this.profession =profession;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", profession=" + profession;
    }
}
