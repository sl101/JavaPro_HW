package de.telran.module1.lecture1.summary.task_2;

public class Auto extends Vehicle{
    private int numberOfDoors;
    private boolean isConvertible;

    public Auto(int numberOfDoors, boolean isConvertible) {
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    @Override
    void start() {
        super.start();
        if(isConvertible) System.out.printf("Это кабриолет и в нем %s двери\n",  numberOfDoors);
    }

    void honk() {
        System.out.println("Бип-бип!");
    }
}
