package de.telran.module1.lecture_20_11_polimorf.pizza;

public interface Customer {

    default  void orderPizza() {
        System.out.println("Заказал пиццу");
    }
    default public void eatPizza() {
        System.out.println("Съел пиццу");
    }
}
