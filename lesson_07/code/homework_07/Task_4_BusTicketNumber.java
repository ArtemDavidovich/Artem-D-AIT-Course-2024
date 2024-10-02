package homework_07;

//Task 4. (*) Enter a six-digit number (bus ticket number).
//Determine whether this ticket is "lucky" (the sum of the first three digits is equal to the sum last three digits).

import java.util.Scanner;

public class Task_4_BusTicketNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bus ticket number. The number must contain 6 digits: ");
        int ticketNumber = scanner.nextInt(); //entering bus ticket number
        int ticketNumber1 = ticketNumber / 1000; // determining the first three digits
        int ticketNumber2 = ticketNumber % 1000; // determining the last three digits

        int sum1 = 0;
        int sum2 = 0;

        // summing the first three digits
        while(ticketNumber1 > 0){
            sum1 = sum1 + ticketNumber1 % 10;
            ticketNumber1 = ticketNumber1 / 10;
        }

        System.out.println(sum1);

        // summing the last three digits
        while(ticketNumber2 > 0){
            sum2 = sum2 + ticketNumber2 % 10;
            ticketNumber2 = ticketNumber2 / 10;
        }

        System.out.println(sum2);

        if (sum1 == sum2){
            System.out.println("Hooray! You have a LUCKY TICKET!");
        } else {
            System.out.println("Sorry... Your ticket is not lucky. Try next time ;)");
        }

    }//end of main

}//end of class
