package homework_08;

//Task 3. Determining the time of day.
//Write a program that takes the current hour (0 to 23)
//and displays a greeting depending on the time of day (morning, afternoon, evening, night).

import java.util.Scanner;

public class Task_3_TimeOfDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current hour (without minutes, e.g. 22): ");
        int hour = scanner.nextInt();

        // checking number correctness
        while(hour<0 || hour>23){
            System.out.println("Wrong input! Try again, please.");
            hour = scanner.nextInt();
        }

        // determining the time of a day
        if(hour >= 1 && hour <= 6){
            System.out.println("Good night!");
        } else if (hour >= 7 && hour <= 12) {
            System.out.println("Good morning!");
        } else if (hour >= 13 && hour <= 18) {
            System.out.println("Good day!");
        } else if (hour >= 19 && hour <= 23 || hour == 0) {
            System.out.println("Good evening!");
        }

    }//end of main

}//end of class
