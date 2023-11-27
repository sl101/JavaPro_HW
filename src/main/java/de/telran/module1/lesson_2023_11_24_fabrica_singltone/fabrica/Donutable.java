package de.telran.module1.lesson_2023_11_24_fabrica_singltone.fabrica;

public interface Donutable {
    String addJam();
    default void eat(){
        System.out.println("Eat donut with " + addJam());
    };
}
