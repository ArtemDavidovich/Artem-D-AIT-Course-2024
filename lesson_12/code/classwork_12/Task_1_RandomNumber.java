package classwork_12;

//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//Запросите у пользователя какое-то натуральное число.
//Определите, есть ли это число в массиве.
//Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
//ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class Task_1_RandomNumber {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();

        //fill in the array numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //print array

        printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        int n = scanner.nextInt();

        boolean isInArray = searchInArray(numbers, n);

        System.out.println(isInArray);

    }//end of main

    private static boolean searchInArray(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == n){
                return true;
            }
        }
        return false;
    }

    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}//end of class
