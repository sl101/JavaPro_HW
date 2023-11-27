package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_1;

public class Plane implements Transport{
    private final double pricePerKm = 2;
    private final double speed = 800;

    @Override
    public double getPrice(double distance) {
        return  distance * pricePerKm;
    }

    @Override
    public double getSpeed(double distance) {
        return distance / speed;
    }
}
