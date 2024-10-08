package cycles;

//**Задача 4.**
//С помощью цикла while написать программу, выводящую на экран результат умножения данного натурального числа n на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех натуральных чисел от 0 до n.

import java.util.Scanner;

public class Task_4_Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        int n = scanner.nextInt();

        int count = 0;
        int sum = 0;

        while(count <= n){
            System.out.print(count * n + " ");
            sum += count;
            count++;
        }

        System.out.println();
        System.out.println("The sum of numbers from 0 to " + n + " is: " + sum);





    }//end of main

}//end of class
