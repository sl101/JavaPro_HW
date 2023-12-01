package de.telran.module1.lesson_2023_11_22_static_enums.hw.task2;

public class CoffeeMachine {
    private CoffeeMachine() {
    }
    public static String getCoffee(String coffee){
        try {
            CoffeeDrink drink = CoffeeDrink.valueOf(coffee.toUpperCase().trim());
            return drink.getDescription();
        } catch (IllegalArgumentException e) {
            return "К сожалению, такого кофейного напитка нет в списке.";
        }
    }
}
