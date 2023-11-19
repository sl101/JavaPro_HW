package de.telran.module1.lecture_15_11.summary.task_1;

public class Employee extends Human{
    protected int salary;


    public Employee(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary;
    }
}
