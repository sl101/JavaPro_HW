package de.telran.module1.practice_20_11;

public  abstract class Hero {
    String name;
    double power;
    double liveLevel;

    public Hero(String name, double power, double liveLevel) {
        this.name = name;
        this.power = power;
        this.liveLevel = liveLevel;
    }

    abstract void atack();
    abstract void say();
}
