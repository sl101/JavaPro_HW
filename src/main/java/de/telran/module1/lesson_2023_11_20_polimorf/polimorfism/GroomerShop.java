package de.telran.module1.lesson_2023_11_20_polimorf.polimorfism;

public class GroomerShop {
    public void cut(Animal animal){
        System.out.printf("Подстригли, животное ");
        animal.voice();
    }
}
