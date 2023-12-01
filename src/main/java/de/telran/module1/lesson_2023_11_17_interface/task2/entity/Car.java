package de.telran.module1.lesson_2023_11_17_interface.task2.entity;

import de.telran.module1.lesson_2023_11_17_interface.task2.interfaces.RemoteControlled;
import de.telran.module1.lesson_2023_11_17_interface.task2.interfaces.Safety;

public class Car implements Safety, RemoteControlled {
    @Override
    public void ensureSafety() {
        System.out.println("Логика для обеспечения безопасности машинки");
    }

    @Override
    public void operateWithRemote() {
        System.out.println("Логика для управления машинкой с помощью пульта");
    }
}