package de.telran.module1.lecture_22_11_static_enums.hw.task1;

public class SimpleDiet {
    public static void main(String[] args) {
        HelthManager helthManager = new HelthManager();
        System.out.println(helthManager.getDietAdvice(Months.JANUARY));
        System.out.println(helthManager.getDietAdvice(Months.FEBRUARY));
        System.out.println(helthManager.getDietAdvice(Months.MARCH));
        System.out.println(helthManager.getDietAdvice(Months.APRIL));
        System.out.println(helthManager.getDietAdvice(Months.MAY));
        System.out.println(helthManager.getDietAdvice(Months.JUNE));
        System.out.println(helthManager.getDietAdvice(Months.JULY));
        System.out.println(helthManager.getDietAdvice(Months.AUGUST));
        System.out.println(helthManager.getDietAdvice(Months.SEPTEMBER));
        System.out.println(helthManager.getDietAdvice(Months.OCTOBER));
        System.out.println(helthManager.getDietAdvice(Months.NOVEMBER));
        System.out.println(helthManager.getDietAdvice(Months.DECEMBER));
    }
}
