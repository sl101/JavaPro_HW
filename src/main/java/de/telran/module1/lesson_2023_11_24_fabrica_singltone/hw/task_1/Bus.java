package de.telran.module1.lesson_2023_11_24_fabrica_singltone.hw.task_1;

public class Bus implements Transport {
    private final double pricePerKm = 0.9;
    private final double speed = 60;

    @Override
    public double getPrice(double distance) {
        return  (int) (distance * pricePerKm);
    }

    @Override
    public double getSpeed(double distance) {
        return (int) (distance / speed);
    }
}
