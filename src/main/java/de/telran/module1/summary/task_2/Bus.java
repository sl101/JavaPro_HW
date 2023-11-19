package de.telran.module1.summary.task_2;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    void start() {
        super.start();
        System.out.printf("Это автобус, и он вмещает %s пассажиров\n",  passengerCapacity);
    }

    void announceNextStop() {
        System.out.println("Следующая остановка: ...\n");
    }
}
