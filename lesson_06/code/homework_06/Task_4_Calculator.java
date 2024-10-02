package homework_06;

//Task 4.(*) Write a calculator application for working with integers:
//oper 1 => + oper 2 => - oper 3 => *, oper 4 => /, oper 5 => % , other print "Wrong operation".
//The numbers and the required operation are entered from the keyboard.

import java.util.Scanner;

public class Task_4_Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0; //variable for calculations

        System.out.println("Type into the 1st integer: ");
        int a = scanner.nextInt(); //inputting the first integer

        System.out.println("Type into the 2nd integer: ");
        int b = scanner.nextInt(); //inputting the second integer

        System.out.println("Choose the operation and type into its number: \nAddition + => 1 \nSubtraction - => 2 \nMultiplication * => 3 \nDivision / => 4 \nRemainder from division % => 5"); //choosing an operation from the list and inputting its number
        int operationNumber = scanner.nextInt();

        switch(operationNumber){
            case 1 -> {
                sum = a+b;
            }
            case 2 -> {
                sum = a-b;
            }
            case 3 -> {
                sum = a*b;
            }
            case 4 -> {
                sum = a/b;
            }
            case 5 -> {
                sum = a%b;
            }
            default -> System.out.println("Wrong operation input.");
        }

        System.out.println("The result of operation is: " + sum);

    }//end of main

}//end of class
