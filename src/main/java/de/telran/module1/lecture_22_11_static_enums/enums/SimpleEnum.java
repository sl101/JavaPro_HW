package de.telran.module1.lecture_22_11_static_enums.enums;

public class SimpleEnum {
    public static void main(String[] args) {
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeekEnum day2 = DayOfWeekEnum.TUESDAY;

//        System.out.println(day1);
//        System.out.println(day2);

        ScholarSchedule scholarSchedule = new ScholarSchedule(DayOfWeekEnum.SUNDAY);

        if(scholarSchedule.isWeekend()){
            System.out.println("is Week end");
        } else System.out.printf("go to school");

        System.out.println(DayOfWeekEnum.valueOf("SUNDAY"));
        System.out.println(DayOfWeekEnum.SUNDAY.ordinal());
        System.out.println(DayOfWeekEnum.SUNDAY.values());
        System.out.println(DayOfWeekEnum.values());


    }
}
