package de.telran.module1.lesson_2023_11_15.summary.task_2;

public class Motorbike extends Vehicle{
    boolean isSport;

    @Override
    void start() {
        if(isSport){
            System.out.printf("Спортивный мотоцикл %s, мчится со скоростью %s\n", brand, speed);
        } else {
            super.start();
        }
    }
}
