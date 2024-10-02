package homework_07;

//Task 1. The program receives as input a string and the number of repetitions of this string.
//The program should print this string required number of times.

import java.util.Scanner;

public class Task_1_StringIterations {

    public static void main(String[] args) {

        // setting initial conditions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string (a single word or a sentence): ");
        String string = scanner.nextLine();
        System.out.println("Input the number of iterations (how many times will the string be repeated: ");
        int number = scanner.nextInt();
        int count = 0;

        while(count < number){
            System.out.println(string);
            count++;
        }

    }//end of main

}//end of class
