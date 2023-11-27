package de.telran.module1.lesson_2023_11_20_polimorf.pizza;

public interface Customer {

    default  void orderPizza() {
        System.out.println("Заказал пиццу");
    }
    default public void eatPizza() {
        System.out.println("Съел пиццу");
    }
}
