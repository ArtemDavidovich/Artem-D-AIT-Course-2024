package homework_05;

//Task 1. Write a method that returns the minimum of two integers. The numbers are specified in the program.

public class Task_1 {

    public static void main(String[] args) {

        int a = 17;
        int b = 29;
        int res = minimumMethod(a, b); // calling the method for defining the lowest number

        System.out.println("The lowest number is " + res);


    } //end of main

    // the method for defining the lowest number
    public static int minimumMethod(int a, int b){
        if(a>=b){
            return b;
        } else{
            return a;
        }
    } // end of minimumMethod

} // end of class
