package cycles;

//**Задача 3.**
//С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
//Пример:для числа n = 3
//1 в кубе 1
//2 в кубе 8
//3 в кубе 27
//...

import java.util.Scanner;

public class Task_3_Cube {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        int n = scanner.nextInt();

        int count = 0;

        while(count < n){
            count++;
            System.out.print(count * count * count + " ");
        }

    }//end of main

}//end of class
