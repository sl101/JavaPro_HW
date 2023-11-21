package de.telran.module1.lecture_20_11.hw.task_1;

public class MoldovanHen extends Hen{
    private final int eggs = 25;
    @Override
    public int getCountOfEggsPerMonth() {
        return this.eggs;
    }

    @Override
    public String getDescription() {
        System.out.println(super.getDescription());
        String COUNTRY = "Moldova";
        return "Моя страна - " + COUNTRY +". Я несу " + this.eggs + " яиц в месяц.";
    }
}
