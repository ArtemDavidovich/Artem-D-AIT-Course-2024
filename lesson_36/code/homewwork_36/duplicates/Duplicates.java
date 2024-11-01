package homewwork_36.duplicates;

//Задача 4.(*) Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10. Удалите из полученного списка дубликаты.

import classwork_14.array_methods.ArrayMethods;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        int[] ints = ArrayMethods.fillRandomArray(1, 10, 20);

        for (int i = 0; i < 20; i++) {
            integers.add(ints[i]);
        }

        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i).equals(integers.get(j))) {
                    integers.remove(j);
                    j--;
                }
            }
        }

        System.out.println(integers);

        //ради интереса спросил еще у ChatGPT, на случай более простого решения

        ArrayList<Integer> integersChat = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integersChat.add(ints[i]);
        }

        ArrayList<Integer> uniqueList = new ArrayList<>(new HashSet<>(integersChat));

        System.out.println(uniqueList);

    }//end of main

}//end of class
