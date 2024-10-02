package homework_09;

//Task 5.(*) The program asks the user for the number of seconds that have passed since the beginning of the day.
//It is necessary to display hours, minutes and seconds.
//Check that the number of seconds entered by the user is no more than 86,400.

import java.util.Scanner;

public class Task_5_HoursMinutesSeconds {

    public static void main(String[] args) {

        int hours, minutes, seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of seconds that have passed since the beginning of the day: ");
        int amountOfSeconds = scanner.nextInt();

        while(amountOfSeconds < 0 || amountOfSeconds > 86400){
            System.out.println("You have entered incorrect number. Please, try again.");
            amountOfSeconds = scanner.nextInt();
        }

        hours = amountOfSeconds / 3600;
        minutes = amountOfSeconds % 3600 / 60;
        seconds = amountOfSeconds % 3600 % 60;

        System.out.println("Current time is " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");

    }//end of main

}//end of class
