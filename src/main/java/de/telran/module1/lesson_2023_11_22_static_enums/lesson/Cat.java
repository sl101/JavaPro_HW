package de.telran.module1.lesson_2023_11_22_static_enums.lesson;

public class Cat {
    public String name;
    int catNumber;
    static String breed;
    static int countCats;

    public Cat(String name) {
        this.name = name;
        increment();
        catNumber = countCats;
    }

    static void increment(){
        countCats++;
    }

    static void setBreed(){
        breed = "Sphinks";
    }
}
