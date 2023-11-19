package de.telran.module1.lecture_15_11.summary.task_2;

public class Vehicle {
    protected String brand;
    protected int year = 2000;
    protected double speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    void start() {
        System.out.printf("Транспортное средство %s %s года выпуска, движется со скоростью %s км.ч.\n", brand, year, speed);
    }

    void stop() {
        System.out.printf("Транспортное средство %s остановилось.\n%n", brand);
    }
}
