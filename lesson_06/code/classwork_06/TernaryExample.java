package classwork_06;

//**Задание 2.**
//  В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryExample {

    public static void main(String[] args) {

        int a = 300;
        int b = 200;

        int min = (a < b) ? a : b; //ternary operator

        System.out.println("Min = " + min);

        int max = (a > b) ? a : b; //ternary operator

        System.out.println("Max = " + max);

        // input data
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        b = scanner.nextInt();

        min = min(a, b);
        System.out.println("Min = " + min);


    }//end of main

    public static int min(int a, int b){
        return (a < b) ? a : b; //ternary operator
    }

}//end of class
