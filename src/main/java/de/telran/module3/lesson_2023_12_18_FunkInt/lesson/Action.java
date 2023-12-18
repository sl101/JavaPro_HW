package de.telran.module3.lesson_2023_12_18_FunkInt.lesson;

@FunctionalInterface
public interface Action {
    void action(int code, HttpCodes codes);
}
