package de.telran.module1.lesson_2023_11_15.summary.task_1;

public class Main {
    public static void main(String[] args) {
        Earthling earthling = new Earthling( 33);
        System.out.println(earthling.toString());
        System.out.println("======");
        Human human = new Human(20, "Bob");
        System.out.println(human.toString());
        System.out.println("======");
        Employee employee = new Employee(40, "Tim", 3000);
        System.out.println(employee.toString());
        System.out.println("======");
        Engineer engineer = new Engineer(18, "Jesica", 3000, "developer");
        System.out.println(engineer.toString());

    }
}
