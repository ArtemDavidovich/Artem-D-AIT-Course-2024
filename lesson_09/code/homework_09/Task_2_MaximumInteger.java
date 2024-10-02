package homework_09;

//Task 2. Write a program that outputs the maximum of three integers.
//Specify the numbers yourself inside the program.
//Solve this problem using if ... else and also using the ternary operator.

public class Task_2_MaximumInteger {

    public static void main(String[] args) {

       int integer1 = 7;
       int integer2 = 25;
       int integer3 = 13;

        //variant with if ... else

       int maxInteger = maxIntegerMethod(integer1, integer2, integer3);
       System.out.println("The Maximum of three specified integers is " + maxInteger);

       //variant with ternary operator

       int maxInteger2 = (integer1 / integer2 > 0 && integer1 / integer3 > 0) ? integer1 : (integer2 / integer1 > 0 && integer2 / integer3 > 0) ? integer2 : integer3;
       System.out.println("The Maximum of three specified integers is " + maxInteger2);

    }//end of main

    private static int maxIntegerMethod(int integer1, int integer2, int integer3){
        if(integer1 / integer2 > 0 && integer1 / integer3 > 0){
            return integer1;
        } else if(integer2 / integer1 > 0 && integer2 / integer3 > 0){
            return integer2;
        } else{
            return integer3;
        }

    }//end of maxIntegerMethod



}//end of class
