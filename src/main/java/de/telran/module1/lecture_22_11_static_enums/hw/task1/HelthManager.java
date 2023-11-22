package de.telran.module1.lecture_22_11_static_enums.hw.task1;

public class HelthManager {
    public String getDietAdvice(Months month){
        String monthTitle = month.getTitle()+" :\n";
        switch (month){
            case DECEMBER: return monthTitle + DietAdvices.WINTER.getRecommendation() + "\n" + DietAdvices.DECEMBER.getRecommendation();
            case JANUARY: return monthTitle + DietAdvices.WINTER.getRecommendation() + "\n" + DietAdvices.JANUARY.getRecommendation();
            case FEBRUARY: return monthTitle + DietAdvices.WINTER.getRecommendation() + "\n" + DietAdvices.FEBRUARY.getRecommendation();
            case MARCH: return monthTitle + DietAdvices.SPRING.getRecommendation() + "\n" + DietAdvices.MARCH.getRecommendation();
            case APRIL: return monthTitle + DietAdvices.SPRING.getRecommendation() + "\n" + DietAdvices.APRIL.getRecommendation();
            case MAY: return monthTitle + DietAdvices.SPRING.getRecommendation() + "\n" + DietAdvices.MAY.getRecommendation();
            case JUNE: return monthTitle + DietAdvices.SUMMER.getRecommendation() + "\n" + DietAdvices.JUNE.getRecommendation();
            case JULY: return monthTitle + DietAdvices.SUMMER.getRecommendation() + "\n" + DietAdvices.JULY.getRecommendation();
            case AUGUST: return monthTitle + DietAdvices.SUMMER.getRecommendation() + "\n" + DietAdvices.AUGUST.getRecommendation();
            case SEPTEMBER: return monthTitle + DietAdvices.AUTUMN.getRecommendation() + "\n" + DietAdvices.SEPTEMBER.getRecommendation();
            case OCTOBER: return monthTitle + DietAdvices.AUTUMN.getRecommendation() + "\n" + DietAdvices.OCTOBER.getRecommendation();
            case NOVEMBER: return monthTitle + DietAdvices.AUTUMN.getRecommendation() + "\n" + DietAdvices.NOVEMBER.getRecommendation();
        }
        return null;
    };
}
