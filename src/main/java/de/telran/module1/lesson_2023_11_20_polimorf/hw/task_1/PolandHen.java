package de.telran.module1.lesson_2023_11_20_polimorf.hw.task_1;

public class PolandHen extends Hen{
    private final int eggs = 20;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.eggs;
    }

    @Override
    public String getDescription() {
        System.out.println(super.getDescription());
        String COUNTRY = "Poland";
        return "Моя страна - " + COUNTRY +". Я несу " + this.eggs + " яиц в месяц.";
    }
}
