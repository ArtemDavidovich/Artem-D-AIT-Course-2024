package homework_33.week_day;

import homework_33.week_day.model.WeekDay;

public class WeekDayAppl {

    public static void main(String[] args) {

        WeekDay[] weekDays = WeekDay.values();
        System.out.println("-----------values-----------");
        for (WeekDay weekDay : weekDays) {
            System.out.println(weekDay.getName() + " is " + weekDay.getNumber() + " day of a week.");
        }

        System.out.println("-----------toString()-----------");
        System.out.println(WeekDay.SAT.toString());

        System.out.println("-----------ordinal()-----------");
        System.out.println(WeekDay.THU.ordinal());

        System.out.println("-----------valueOf()-----------");
        System.out.println(WeekDay.valueOf("WED"));

        System.out.println("================================");

        int n = 10;
        WeekDay w = WeekDay.MON;
        System.out.println("Start day: " + w);
        w = w.plusDay(n);
        System.out.println("After " + n + " days: " + w);

    }//end of main

}//end of class
