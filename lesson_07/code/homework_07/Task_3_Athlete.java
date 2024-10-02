package homework_07;

//Task 3. On the first day the athlete ran s kilometers, and then every day he increased his mileage by 10% of previous value.
//Determine the number of the day for which the athlete’s mileage will be at least target kilometers.
//The program receives real numbers s and target as input and must output one natural number.

import java.util.Scanner;

public class Task_3_Athlete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the distance an athlete ran on the first day (real number in kilometers, e.g. 2,35): ");
        double s = scanner.nextDouble(); // first day distance
        System.out.println("Input the target distance (real number in kilometers, e.g. 14,00): ");
        double target = scanner.nextDouble(); // total required distance

        double distance = s; //distance which athlete runs every new day
        int countDays = 1; //counter for required number of days

        while (distance < target){
            countDays++;
            distance = distance + distance * 0.1;
            System.out.println("On the " + countDays + " day the athlete ran " + distance + " kilometers.");
        }

        System.out.println("It will take " + countDays + " day(s) for the athlete to run " + target + " kilometers.");


    }//end 0f main

}//end of class
