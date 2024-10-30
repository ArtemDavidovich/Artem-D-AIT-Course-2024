package homework_34.time.utils;

//Задача 1.
//
//В классе DateOperation из классной работы, реализовать метод getAge, принимающий дату рождения в виде стринга, и возвращающий возраст.
//
//Задача 2.
//
//В классе DateOperation из классной работы, реализовать метод sortStringDates, принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
//
//Для проверки используйте класс DateOperationTest с юнит-тестами.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperation {

    public static int getAge(String birthDate) {
        LocalDate ld = LocalDate.now();
        LocalDate bdLocal = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
        return (int)ChronoUnit.YEARS.between(bdLocal, ld);
    }

    public static String[] sortStringDates(String[] dates) {
        int count = 0;
        for (int i = 0; i < dates.length; i++) {
            LocalDate result = LocalDate.parse(dates[i], DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
            String strResult = result.toString();
            if (!(dates[i].equals(strResult))) {
                count++;
            }
        }
        String[] specialDates = new String[count];
        String[] specialDates2 = new String[count];
        for (int i = 0, j = 0, k = 0; i < dates.length; i++) {
            LocalDate result = LocalDate.parse(dates[i], DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
            String strResult = result.toString();
            if (!(dates[i].equals(strResult))) {
                specialDates[j] = strResult;
                specialDates2[k] = dates[i];
                j++;
                k++;
            }
            dates[i] = strResult;
        }
        Comparator<String> comparator = null;
        Arrays.sort(dates, comparator);
        comparator = (s1, s2) -> {
            String[] firstArray = s1.split("-");
            reverseArray(firstArray);
            String str1 = String.join("", firstArray);

            String[] secondArray = s2.split("-");
            reverseArray(secondArray);
            String str2 = String.join("", secondArray);

            return str1.compareTo(str2);
        };
        for (int i = 0, j = 0, k = 0; j < specialDates.length && k < specialDates2.length; i++) {
            if (dates[i].equals(specialDates[j])) {
                dates[i] = specialDates2[k];
                j++;
                k++;
            }
        }
        return dates;
    }

    public static String[] reverseArray(String[] array){
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
        return array;
    }

}//end of class
