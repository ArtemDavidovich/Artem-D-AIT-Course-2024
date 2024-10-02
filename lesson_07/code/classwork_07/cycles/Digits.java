package classwork_07.cycles;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // 5 467
        // 5 467 % 10 = 7 - это первая справа цифра числа
        // 5 467 / 10 = 546
        // продолжим в цикле / 10 пока результат > 0

        // initial data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer: ");

        int number = scanner.nextInt();
        int count = 0;
        int number1 = number;

        while (number > 0){
            number = number / 10; //number - это параметр цикла
            System.out.println(number);
            count++;
        }

        System.out.println("The number " + number1 + " has " + count + " digits.");


    }//end of main

}//end of class
