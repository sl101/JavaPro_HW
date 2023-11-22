package de.telran.module1.lecture_22_11_static_enums.lesson;

public class SimpleCat {

    public static void main(String[] args) {

    Cat cat1 = new Cat("Murka");
    Cat cat2 = new Cat("Basilio");
    Cat.increment();
    Cat.setBreed();
        System.out.println(cat2.name + " " + Cat.breed + " - > " + cat2.catNumber);
        System.out.println(cat1.name +" - > " + cat1.catNumber);

    }


}
