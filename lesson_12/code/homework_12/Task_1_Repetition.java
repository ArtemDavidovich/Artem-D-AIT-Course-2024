package homework_12;

//Задача 1. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
//Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

import java.util.Scanner;

import static homework_12.Task_1_Repetition_Methods.sumCalculation;

public class Task_1_Repetition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer: ");
        int n  = scanner.nextInt();

        //filling in array
        double[] array1DivideN = Task_1_Repetition_Methods.fillInArray(n);

        //printing array
        Task_1_Repetition_Methods.printArray(array1DivideN);

        //calculating sum of array
        double sum = sumCalculation(array1DivideN);

        //printing final result
        Task_1_Repetition_Methods.printResult(sum);

    }//end of main

}//end of class
