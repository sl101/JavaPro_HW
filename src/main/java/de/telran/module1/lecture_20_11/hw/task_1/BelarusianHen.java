package de.telran.module1.lecture_20_11.hw.task_1;

public class BelarusianHen extends Hen{
    private final int eggs = 20;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.eggs;
    }

    @Override
    public String getDescription() {
        System.out.println(super.getDescription());
        String COUNTRY = "Belarus";
        return "Моя страна - " + COUNTRY +". Я несу " + this.eggs + " яиц в месяц.";
    }
}
