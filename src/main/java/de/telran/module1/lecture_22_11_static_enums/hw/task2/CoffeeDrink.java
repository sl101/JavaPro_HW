package de.telran.module1.lecture_22_11_static_enums.hw.task2;

public enum CoffeeDrink {
    ESPRESSO("Эспрессо - короткий, концентрированный кофе, приготовленный под давлением."),
    AMERICANO("Американо - кофе, разбавленный горячей водой для более мягкого вкуса."),
    LATTE("Латте - кофе с молоком, обычно с добавлением молочной пенки."),
    CAPPUCCINO("Капучино - кофе с равными частями кофе, молока и молочной пенки."),
    MACCHIATO("Макиато - кофе с небольшим количеством молока или молочной пенки."),
    MOCHA("Мокко - кофе с шоколадом и молоком."),
    FLAT_WHITE("Флэт уайт - кофе с молоком без пены."),
    IRISH_COFFEE("Ирландский кофе - кофе с виски и сливками."),
    VIENNA_COFFEE("Венский кофе - кофе с взбитыми сливками и шоколадной посыпкой."),
    AFFOGATO("Аффогато - шарик мороженого, политый эспрессо.");

//    public static CoffeeDrink coffeType;
    private final String description;

    CoffeeDrink(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
