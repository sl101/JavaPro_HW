package de.telran.module1.mytreni;

public class Main extends MyClass implements MyInterface{
    public static void main(String[] args) {
//    String name = MyInterface.name;
        System.out.println(name);
    }

    @Override
    void sayBye() {
        System.out.println("Buy!");
    }
}

abstract class MyClass   {
    String s;
    int a;

    void sayHello(){
        System.out.println("Hello");
    }
    abstract void sayBye();
}

interface MyInterface{
    String name = "Slava";

    default void sayName(){
        System.out.println("Меня зовут " + name);
    }
}