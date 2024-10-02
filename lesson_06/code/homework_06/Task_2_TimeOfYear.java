package homework_06;

//Task 2. The user enters a number from 1 to 12 using the keyboard,
// the program reports what time of year the entered month belongs to.

import java.util.Scanner;

public class Task_2_TimeOfYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type into the number of a month: ");
        int yearSeason = scanner.nextInt();

        switch(yearSeason){
            case 1,2,12 -> {
                System.out.println("This is Winter.");
            }
            case 3,4,5 -> {
                System.out.println("This is Spring.");
            }
            case 6,7,8 -> {
                System.out.println("This is Summer.");
            }
            case 9,10,11 -> {
                System.out.println("This is Autumn.");
            }
            default -> System.out.println("Wrong input!");
        }

    }//end of main

}//end of class
