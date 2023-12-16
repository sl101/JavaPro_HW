package de.telran.module2.lesson_2023_12_15.functional;

public interface SimpleFunInterface {
    void doWork();
    default void doSmth(){
        System.out.println("doSmth");
    };

    static void doAnothe(){
        System.out.println("Statick");
    };
}
