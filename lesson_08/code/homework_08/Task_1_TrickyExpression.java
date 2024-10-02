package homework_08;

//Task 1. What is the value of the expression x-- + --x at x = 5? Test your guess with code.

public class Task_1_TrickyExpression {

    public static void main(String[] args) {

        //x-- - postfix  => x= x-1 AFTER using it in expression
        //--x - prefix   => x= x-1 BEFORE using it in expression

        int x = 5;
        System.out.println(x-- + --x);

    }//end of main

}//end of class
