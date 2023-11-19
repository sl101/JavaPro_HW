package de.telran.module1.summary.task_2;

public class Main {
    public static void main(String[] args) {
        moveVehicle();
        moveAuto();
        moveBus();
        moveBicycle ();
        moveMotorBike();
    }

    private static void moveMotorBike() {
        Motorbike moto = new Motorbike();
        moto.setBrand("Suzuki");
        moto.setSpeed(400);
        moto.start();
    }

    private static void moveBicycle () {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Fahrad");
        bicycle.setSpeed(55.5);
        bicycle.setYear(2023);
        bicycle.start();
        bicycle.ringBell();
    }

    private static void moveBus() {
        Bus bus = new Bus(40);
        bus.setBrand("Icarus");
        bus.setYear(2010);
        bus.setSpeed(60);
        bus.start();
        bus.announceNextStop();
    }

    private static void moveAuto() {
        Auto auto = new Auto(2, true);
        auto.setBrand("Jaguar");
        auto.setYear(2020);
        auto.setSpeed(300);
        auto.start();
        auto.honk();
        auto.stop();
    }

    private static void moveVehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Mercedes");
        vehicle.setYear(2024);
        vehicle.setSpeed(180);
        vehicle.start();
        vehicle.stop();
    }
}
