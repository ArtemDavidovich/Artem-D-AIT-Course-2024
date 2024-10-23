package homework_30.sorting_double;

//Задание 2. Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортровки:
//
//ascending; //
//descending. //

import java.util.Arrays;

public class SortingDouble {

    public static void main(String[] args) {

        Double[] array = new Double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 11;
            System.out.printf("%.2f   ", array[i]);
        }
        System.out.println();
        System.out.println("-------------------------------");

        //ascending sorting
        Arrays.sort(array, (d1, d2) -> Double.compare(d1, d2));
        for (Double number : array){
            System.out.printf("%.2f   ", number);
        }
        System.out.println();
        System.out.println("-------------------------------");

        //descending sorting
        Arrays.sort(array, (d1, d2) -> Double.compare(d2, d1));
        for (Double number : array){
            System.out.printf("%.2f   ", number);
        }

    }//end of main

}//end of class
