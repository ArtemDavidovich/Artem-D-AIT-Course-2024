package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        //What time is it now? ISO format: YYYY-mm-DD
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("-------------------------------------------");

        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin); // ISO

        //Which day of week was it?
        System.out.println(gagarin.getDayOfWeek());

        //Which day of year was it?
        System.out.println(gagarin.getDayOfYear());

        //...
        System.out.println("-----------------Is leap year?--------------");
        int year = 2024;
        System.out.println("Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("-----------------------------------------------");
        System.out.println(gagarin.isBefore(ld)); //true
        System.out.println(gagarin.isAfter(ld)); //false
        System.out.println("-----------------------------------------------");
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);

        System.out.println("----------------DateTimeFormatter---------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE; //YYYY-mm-DD
        String date = gagarin.format(df); //LocalDate to String
        System.out.println(date);

        //choosing another format
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        //setting own date format
        System.out.println("-----------------------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MMMM/yy"); //making different formats
        date = gagarin.format(df);
        System.out.println(date);

        //setting locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.JAPANESE);
        date = gagarin.format(df);
        System.out.println(date);

        //parsing LocalDate from String
        System.out.println("///////////////////////////////////////////////");
        String stringDate = "29-02-2023";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy]"));
        System.out.println(result);

    }//end of main

}//end of class
