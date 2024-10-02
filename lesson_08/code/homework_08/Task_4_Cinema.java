package homework_08;

//Task 4. The cinema has different types of tickets: standard, student (-10%) and for pensioners (-25%).
//Each type of ticket has its own cost. The client can also choose a seat in the VIP area, which will increase the ticket price by 25%.
//Create a calculateTicketPrice method that accepts the customer's age, student status and a VIP seat flag, and returns the total cost of the ticket.
//Implement a bot-application that asks the necessary questions and announces the cost of the ticket.

import java.util.Scanner;

public class Task_4_Cinema {

    public static void main(String[] args) {

        //bot-questionnaire
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your age: "); //inputting customers age
        int age = scanner1.nextInt();

        boolean student = false;//variable for student status

        //checking student status for people aged between 18 and 35
        if(age >= 18 && age <= 35){
            System.out.println("Are you a student (true | false)? ");
            student = scanner1.nextBoolean();
        }

        //VIP area status

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Do you want to sit in VIP-area (true | false)? ");
        boolean vip = false;
        vip = scanner2.nextBoolean();

        double finalTicketPrice = calculateTicketPrice(age, student, vip);
        System.out.println("Your ticket price is: " + finalTicketPrice + " Euro.");

    }//end of main

    private static double calculateTicketPrice(int age, boolean student, boolean vip) {
        double ticketPrice = 100; //regular price
        double ticketPriceAge = 0; //variable for price calculation for pensioners
        double ticketPriceStudent = 0; //variable for price calculation for students
        double ticketPriceVip = 0; //variable for price calculation for vip-area
        if(age >= 65){
            ticketPriceAge = 100 - ticketPrice * 0.75;
        } if(student){
            ticketPriceStudent = 100 - ticketPrice * 0.9;
        } if(vip){
            ticketPriceVip = 100 - ticketPrice * 0.75;
        }

        return ticketPrice - ticketPriceAge - ticketPriceStudent + ticketPriceVip;

    }//end of calculateTicketPrice

}//end of class
