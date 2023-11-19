package de.telran.module1.lecture_17_11.hw.task2.entity;

import de.telran.module1.lecture_17_11.hw.task2.interfaces.Safety;
import de.telran.module1.lecture_17_11.hw.task2.interfaces.VoiceSignaling;

public class Doll implements Safety, VoiceSignaling {
    @Override
    public void ensureSafety() {
        System.out.println("Логика для обеспечения безопасности куклы");
    }

    @Override
    public void emitVoiceSignal() {
        System.out.println("Логика для подачи голосового сигнала куклы");
    }
}
