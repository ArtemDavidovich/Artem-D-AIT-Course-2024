package homework_06;

//Task 3. Write a program for a car at a traffic light. What to do if the light is red, yellow or green.
//The color of the traffic light is set in the program, then from the keyboard.

import java.util.Scanner;

public class Task_3_TrafficLight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type into the color of the traffic light (1 - red, 2 - yellow, 3 - green): ");
        int trafficLightColor = scanner.nextInt();

        switch(trafficLightColor){
            case 1 -> {
                System.out.println("Stop driving!");
            }
            case 2 -> {
                System.out.println("Prepare to drive.");
            }
            case 3 -> {
                System.out.println("Go!");
            }
            default -> System.out.println("Wrong input!");
        }


    }//end of main

}//end of class
