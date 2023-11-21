package de.telran.module1.lecture_20_11.polimorfism;

public class GroomerShop {
    public void cut(Animal animal){
        System.out.printf("Подстригли, животное ");
        animal.voice();
    }
}
