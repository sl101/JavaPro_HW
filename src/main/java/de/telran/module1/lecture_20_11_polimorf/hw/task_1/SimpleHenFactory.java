package de.telran.module1.lecture_20_11_polimorf.hw.task_1;

public class SimpleHenFactory {
    public static void main(String[] args) {
        Hen hen1 = new UkrainianHen();
        Hen hen2 = new PolandHen();
        Hen hen3 = new MoldovanHen();
        Hen hen4 = new GermanHen();

        Hen[] hensList = new Hen[] {hen1, hen2, hen3, hen4};

        for (Hen hen: hensList) {
            System.out.println(Factory.getHen(hen).getDescription());
        }
    }
}
