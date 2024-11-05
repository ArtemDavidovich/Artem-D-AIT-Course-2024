package homework_38.day_temperature;

//Сформируйте два ArrayList и внесите в них данные измерений температуры. Рассчитайте среднюю температуру в городе за прошедшие две недели. В какой день была минимальная температура? В какой день максимальная?

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DayTemperatureAppl {

    public static void main(String[] args) {

        List<DayTemperature> october = new ArrayList<>();
        october.add(new DayTemperature(LocalDate.of(2023, 10, 25), 16));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 26), 14));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 27), 11));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 28), 14));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 29), 16));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 30), 12));
        october.add(new DayTemperature(LocalDate.of(2023, 10, 31), 10));

        List<DayTemperature> november = new ArrayList<>();
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 1), 14));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 2), 8));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 3), 6));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 4), 10));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 5), 10));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 6), 12));
        november.add(new DayTemperature(LocalDate.of(2023, 11 , 7), 11));

        List<DayTemperature> temperatures = new ArrayList<>(october);
        temperatures.addAll(november);

        System.out.printf("Average temperature (25.10 - 07.11) = %.2f", averageTemperature(temperatures));
        System.out.println();
        System.out.println("================================");

        System.out.println("The lowest temperature was on " + minTemperatureDate(temperatures));
        System.out.println("The highest temperature was on " + maxTemperatureDate(temperatures));

        //alternative way
        System.out.println("================================");
        DayTemperature minTemperatureDay = Collections.min(temperatures, Comparator.comparing(DayTemperature::getTemperature));
        DayTemperature maxTemperatureDay = Collections.max(temperatures, Comparator.comparing(DayTemperature::getTemperature));

        System.out.println("The lowest temperature was: " + minTemperatureDay.getTemperature() + "°C, date: " + minTemperatureDay.getDate());
        System.out.println("The highest temperature was: " + maxTemperatureDay.getTemperature() + "°C, date: " + maxTemperatureDay.getDate());

    }//end of main

    private static double averageTemperature (List<DayTemperature> list){
        double sum = 0;
        for (DayTemperature dayTemperature : list) {
            sum += dayTemperature.getTemperature();
        }
        return sum / list.size();
    }

    private static LocalDate minTemperatureDate(List<DayTemperature> list){
        double x = list.getFirst().getTemperature();
        LocalDate ld = list.getFirst().getDate();
        for (int i = 1; i < list.size(); i++) {
            if(x > list.get(i).getTemperature()){
                x = list.get(i).getTemperature();
                ld = list.get(i).getDate();
            }
        }
        return ld;
    }

    private static LocalDate maxTemperatureDate(List<DayTemperature> list){
        double x = list.getFirst().getTemperature();
        LocalDate ld = list.getFirst().getDate();
        for (int i = 1; i < list.size(); i++) {
            if(x < list.get(i).getTemperature()){
                x = list.get(i).getTemperature();
                ld = list.get(i).getDate();
            }
        }
        return ld;
    }


}//end of class
