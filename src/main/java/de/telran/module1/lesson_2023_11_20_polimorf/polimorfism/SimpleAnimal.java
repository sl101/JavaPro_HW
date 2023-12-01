package de.telran.module1.lesson_2023_11_20_polimorf.polimorfism;

public class SimpleAnimal {
    public static void main(String[] args) {
        GroomerShop groomerShop =new GroomerShop();

//    Animal animal = new Cat();
//    animal.voice();
//    groomerShop.cut(animal);

//    animal = new Dog();
//    animal.voice();
//    groomerShop.cut(animal);

//    Duck duck = new Duck();

    Animal[] animals = new Animal[]{new Dog(), new Cat(), new Duck()};

        for (Animal animal: animals) {
            animal.voice();
            if(animal instanceof  Cat){
            groomerShop.cut(animal);
            ((Cat) animal).voice("meow good!!!");
            } else{
            groomerShop.cut(animal);
            }
        }

    }
}
