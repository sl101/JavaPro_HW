package de.telran.module1.lecture_22_11_static_enums.lesson;

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
