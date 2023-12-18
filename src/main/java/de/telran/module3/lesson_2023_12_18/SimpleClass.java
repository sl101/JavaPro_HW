package de.telran.module3.lesson_2023_12_18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class SimpleClass {
    public static void main(String[] args) {

        useInterface();
    }

    public static void useInterface(){
        String dogName = "bublick";
        String dogBreed = "dog";
        int dogAge =10;
        String call = "woof woof";
        MyFuncInterface int1 = new MyFuncInterface() {
            @Override
            public void printCall(Dog dog, String call) {
                System.out.println(dog.getName()+ " " + dog.getBreed() + " " + " say " + call);
            }

//            @Override
//            public void printCall(Dog dog) {
//
//            }

//            @Override
//            public void printCall(Dog dog, String call, int age) {
//
//            }
        };
        int1.printCall(new Dog(dogName, dogBreed,dogAge), call);

        MyFuncInterface int2 = (dog, message) -> System.out.println("new Dog name is: "+ dog.getName() + " say " + message);
        int2.printCall(new Dog(dogName, dogBreed,dogAge), "gav");
    }
}

interface MyFuncInterface{
     void printCall(Dog dog, String call);
//     void printCall(Dog dog);
//     void printCall(Dog dog, String call, int age);
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
class Dog{
    String name;
    String breed;
    int age;

}