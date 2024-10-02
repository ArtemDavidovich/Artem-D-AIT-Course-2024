package homework_14;

//Problem 2. S rubles were deposited into a savings bank for a three-percent deposit.
//What will the deposit amount be in n years? Use the for loop.

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_Repeat_Deposit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the amount of initial deposit: "); //choosing the amount of basic deposit
        double s = scanner.nextDouble();

        System.out.println("Input the number of a year for deposit calculation: "); //choosing the number of years for deposit calculation
        int n = scanner.nextInt();

        double[] depositCalculation = new double[n + 1]; //+1 - while we need to integrate basic deposit (null year, starting point) into the array

        double rate = 0.03; //bank year rate

        depositCalculation[0] = s; //setting the starting deposit

        for (int i = 1; i < depositCalculation.length; i++) { //i = 1 - while we need to skip the 0 index (we have already set it)
            depositCalculation[i] = depositCalculation[i - 1] + depositCalculation[i - 1] * rate; //formula for deposit calculation
        }

        s = depositCalculation[depositCalculation.length - 1]; //the amount of deposit in N years

        System.out.println(Arrays.toString(depositCalculation));
        System.out.print("The current amount of deposit in " + n);
        System.out.printf(" years will be %.2f rubles.", s);

    }//end of main

}//end of class
