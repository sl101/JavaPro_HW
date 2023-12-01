package de.telran.module1.lesson_2023_11_24_fabrica_singltone.singltone;

import de.telran.module1.lesson_2023_11_24_fabrica_singltone.singltone.var1.Вarrier;
import de.telran.module1.lesson_2023_11_24_fabrica_singltone.singltone.var2.Gate;

public class SingleBarrier {
    public static void main(String[] args) {
        Вarrier barrier = Вarrier.getInstance();
        barrier.isOpen();
        barrier.openBarrier();
        barrier.isOpen();

        Вarrier newBarrier = Вarrier.getInstance();
        newBarrier.isOpen();

        Gate gate = Gate.INSTANCE;
        Gate gate2 = Gate.INSTANCE;
        gate.openGate();
        gate.isOpen();
        gate2.isOpen();
        System.out.println("gate = " + gate.hashCode());
        System.out.println("gate2 = " + gate2.hashCode());
        System.out.println(gate == gate2);
        System.out.println(gate.equals(gate2));
    }
}
