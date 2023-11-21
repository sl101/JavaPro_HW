package de.telran.module1.lecture_17_11.task2;

import de.telran.module1.lecture_17_11.task2.entity.Airplane;
import de.telran.module1.lecture_17_11.task2.entity.Boat;
import de.telran.module1.lecture_17_11.task2.entity.Car;
import de.telran.module1.lecture_17_11.task2.entity.Doll;

public class Main {
    public static void main(String[] args) {
        Doll doll = new Doll();
        Airplane airplane = new Airplane();
        Car car = new Car();
        Boat boat = new Boat();

        // Можно вызывать методы, соответствующие интерфейсам, для каждой игрушки
        doll.emitVoiceSignal();
        airplane.fly();
        car.ensureSafety();
        boat.swim();
    }
}
