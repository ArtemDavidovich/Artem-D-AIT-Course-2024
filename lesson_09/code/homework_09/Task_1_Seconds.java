package homework_09;

//Task 1. The program specifies hours, minutes, and seconds.
//It is necessary to output the total number of seconds that have passed since the beginning of the day.
//Perform the calculation in the method that receives hours, minutes, and seconds as input.

public class Task_1_Seconds {

    static int hours = 13;
    static int minutes = 46;
    static int seconds = 14;

    public static void main(String[] args) {

        int totalSeconds = timeConverterMethod(hours, minutes, seconds);
        System.out.println(totalSeconds + " seconds have passed since the beginning of the day.");

    }//end of main

    public static int timeConverterMethod(int hours, int minutes, int seconds){

        return hours*3600 + minutes*60 + seconds;

    }//end of timeConverterMethod

}//end of class
