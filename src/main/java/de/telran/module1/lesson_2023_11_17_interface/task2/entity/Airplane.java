package de.telran.module1.lesson_2023_11_17_interface.task2.entity;

import de.telran.module1.lesson_2023_11_17_interface.task2.interfaces.Safety;
import de.telran.module1.lesson_2023_11_17_interface.task2.interfaces.RemoteControlled;
import de.telran.module1.lesson_2023_11_17_interface.task2.interfaces.Flyable;

public class Airplane implements Safety, RemoteControlled, Flyable {
    @Override
    public void ensureSafety() {
        System.out.println("Логика для обеспечения безопасности самолета");
    }

    @Override
    public void operateWithRemote() {
        System.out.println("Логика для управления самолетом с помощью пульта");
    }

    @Override
    public void fly() {
        System.out.println("Логика для полета самолета");
    }
}