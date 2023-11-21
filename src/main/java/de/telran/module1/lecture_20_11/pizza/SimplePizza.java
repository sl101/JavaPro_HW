package de.telran.module1.lecture_20_11.pizza;

public class SimplePizza {
    public static void main(String[] args) {
        PizzaEngine pizzaEngine = new PizzaEngine();

        Customer customer = pizzaEngine;
        customer.orderPizza();

        Pizzeola pizzeola = pizzaEngine;
        pizzeola.cookIngredients();
        pizzeola.cookPizza();

        Courier courier = pizzaEngine;
        courier.packPizza();
        courier.deliveryPizza();

        customer.eatPizza();

        pizzaEngine.eatPizza();
    }
}
