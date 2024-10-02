package homework_10;

//Task 1
//Collect data of previous week's daytime temperatures in your city into an array.
//Print the temperature that was on Tuesday and then on Thursday. Find the average temperature for the past week.

import java.util.Scanner;

public class Task_1_Temperature {

    public static void main(String[] args) {

        int[] temperature = {9, 15, 19, 19, 20, 23, 21}; //setting the array

        System.out.println("The temperature on previous Tuesday was " + temperature[1] + " grad."); //outputting Tuesday's temperature
        System.out.println("The temperature on previous Thursday was " + temperature[3] + " grad."); //outputting Thursday's temperature

        int sumTemperature = 0; //variable for sum of temperature (for average temperature)

        for (int i = 0; i < temperature.length; i++) {
            sumTemperature = sumTemperature + temperature[i];
        }

        double avgTemperature = (double) sumTemperature / temperature.length; //counting average temperature

        System.out.printf("The average temperature of previous week is %.1f grad.", avgTemperature);

    }//end of main

}//end of class
