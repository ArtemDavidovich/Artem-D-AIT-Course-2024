package homework_06;

//Task 1. Write a program for calculating the payment of money to an employee,
// taking into account the bonus for length of service, if the base salary is $500.
// For 3 years of work, a 10% bonus, for 5 years of work, a 50% bonus, for 10 years of work, a 100% bonus, for 15 years of work, a 150% bonus.
// How many years the employee has worked is entered from the keyboard.

import java.util.Scanner;

public class Task_1_Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type into the number of your whole working years: ");
        int baseSalary = 500; //base salary for all employers
        double totalSalary = 0; //total salary depending on the term of work

        int n = scanner.nextInt(); //the term of work

        if(n<3){
            totalSalary = baseSalary;
        } else if(n>=3 && n<5){
            totalSalary = baseSalary + baseSalary * 0.1;
        } else if (n>=5 && n<10){
            totalSalary = baseSalary + baseSalary * 0.5;
        } else if (n>=10 && n<15){
            totalSalary = baseSalary + baseSalary;
        } else if (n>=15){
            totalSalary = baseSalary + baseSalary * 1.5;
        }

        System.out.println("Your salary is " + totalSalary + "$.");


    }//end of main

}//end of class
