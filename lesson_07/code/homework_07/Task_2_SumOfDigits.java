package homework_07;

//Task 2. Enter a positive integer, find the sum of its digits.

import java.util.Scanner;

public class Task_2_SumOfDigits {

    public static void main(String[] args) {

        // setting initial conditions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a positive integer: ");
        int integer = scanner.nextInt();
        int integerBasic = integer; // variable for final sout
        int sum = 0;

        while (integer > 0){
            sum = sum + integer % 10; // summing the digits of integer
            System.out.println(sum);
            integer = integer / 10; // removing last/redundant digit
            System.out.println(integer);
        }

        System.out.println("The sum of " + integerBasic + " digits is " + sum);


    }//end of main

}//end of class
