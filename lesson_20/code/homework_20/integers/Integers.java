package homework_20.integers;

//Задание 1. Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string with integers:");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("---------------------------------");

        String[] strings = str.split(" "); //making String an array without spaces
        Integer[] integers = new Integer[strings.length]; //setting up Integer array with the same number of elements with String array
        int sum = 0;

        for (int i = 0, j = 0; i < strings.length; i++, j++) {
            integers[j] = Integer.parseInt(strings[i]); //transferring String-elements to Integer-elements
            sum += integers[j];
        }

        System.out.println("The sum of the numbers in the string is " + sum);

    }//end of main

}//end of class
