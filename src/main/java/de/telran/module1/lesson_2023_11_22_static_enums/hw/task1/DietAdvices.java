package de.telran.module1.lesson_2023_11_22_static_enums.hw.task1;

public enum DietAdvices {

    JANUARY("Употребляйте больше сезонных фруктов и овощей."),
    FEBRUARY("Обращайте внимание на богатые железом продукты, такие как фасоль, шпинат и гречка."),
    MARCH("Добавьте в рацион больше зеленых овощей для витаминов и антиоксидантов."),
    APRIL("Употребляйте больше свежих ягод и зелени для витаминов и минералов."),
    MAY("Сделайте ставку на свежие овощи и фрукты для усиления иммунитета."),
    JUNE("Добавьте в рацион сезонные ягоды и фрукты для энергии и витаминов."),
    JULY("Питайтесь больше свежей зеленью и овощами для поддержания гидратации."),
    AUGUST("Употребляйте больше сезонных фруктов и овощей для укрепления здоровья кожи."),
    SEPTEMBER("Обращайте внимание на овощи и фрукты для поддержания иммунитета."),
    OCTOBER("Добавьте в рацион орехи и семена для здоровья сердца и мозга."),
    NOVEMBER("Употребляйте больше корнеплодов и овощей для витаминов и минералов."),
    DECEMBER("Обратите внимание на сезонные фрукты и овощи для поддержания здоровья в холодное время года."),

    WINTER("Зимой употребляйте больше горячих напитков и питательных супов."),
    SPRING("Весной обращайте внимание на свежие овощи и зелень для очищения организма."),
    SUMMER("Летом пейте больше воды и употребляйте свежие фрукты и овощи для поддержания гидратации."),
    AUTUMN("Осенью добавьте в рацион сезонные фрукты и овощи для поддержания иммунитета в период изменения погоды.");

    private final String recommendation;

    DietAdvices(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }
}