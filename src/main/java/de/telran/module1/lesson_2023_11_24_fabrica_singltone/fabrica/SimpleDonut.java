package de.telran.module1.lesson_2023_11_24_fabrica_singltone.fabrica;

public class SimpleDonut {
    public static void main(String[] args) {
       Donutable donut = DonutsFactory.getInstance(DonutType.PEACH);
       donut.eat();
    }
}
