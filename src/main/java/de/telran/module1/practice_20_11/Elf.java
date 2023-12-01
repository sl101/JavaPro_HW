package de.telran.module1.practice_20_11;

public class Elf extends Hero implements Flyable{

    public Elf(String name, double power, double liveLevel) {
        super(name, power, liveLevel);
    }

    @Override
    void atack() {

    }

    @Override
    void say() {

    }

    @Override
    public void fly() {
        System.out.println("может летать");
    }
}
