package de.telran.module1.lecture_22_11_static_enums.enums;

public class ScholarSchedule {

    private DayOfWeekEnum dayOfWeek;

    public ScholarSchedule(DayOfWeekEnum dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public void setDayOfWeek(DayOfWeekEnum dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }

    public DayOfWeekEnum getDayOfWeek(){
        return dayOfWeek;
    }

    public boolean isWeekend(){
        boolean isWeekend = false;
        switch (dayOfWeek){
            case SUNDAY:
            case SATURDAY:
                isWeekend = true;
        }
        return isWeekend;
    }
}
