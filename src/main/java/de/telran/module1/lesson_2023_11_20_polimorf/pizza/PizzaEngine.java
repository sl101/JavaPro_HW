package de.telran.module1.lesson_2023_11_20_polimorf.pizza;

public class PizzaEngine implements Customer, Pizzeola, Courier {

//    @Override
//    public void orderPizza() {
//        System.out.println("Заказал пиццу");
//    }

//    @Override
//    public void eatPizza() {
//        System.out.println("Съел пиццу");
//    }

    @Override
    public void cookIngredients() {
        System.out.println("Приготовил ингридиенты");
    }

    @Override
    public void cookPizza() {
        System.out.println("Приготовил пиццу");
    }

    @Override
    public void packPizza() {
        System.out.println("Упаковал пиццу");
    }

    @Override
    public void deliveryPizza() {
        System.out.println("Доставил пиццу");
    }
}
