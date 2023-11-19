package de.telran.module1.lecture_17_11.hw.task2.entity;

import de.telran.module1.lecture_17_11.hw.task2.interfaces.RemoteControlled;
import de.telran.module1.lecture_17_11.hw.task2.interfaces.Safety;
import de.telran.module1.lecture_17_11.hw.task2.interfaces.Swimable;
import de.telran.module1.lecture_17_11.hw.task2.interfaces.VoiceSignaling;

public class Boat implements Safety, RemoteControlled, Swimable, VoiceSignaling {
    @Override
    public void ensureSafety() {
        System.out.println("Логика для обеспечения безопасности катера");
    }

    @Override
    public void operateWithRemote() {
        System.out.println("Логика для управления катером с помощью пульта");
    }

    @Override
    public void swim() {
        System.out.println("Логика для плавания катера");
    }

    @Override
    public void emitVoiceSignal() {
        System.out.println("Логика для подачи голосового сигнала катера");
    }
}