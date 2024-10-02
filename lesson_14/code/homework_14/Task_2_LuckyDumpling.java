package homework_14;

//Problem 2. A problem about finding a "lucky dumpling".
//The hostess made 30 dumplings for her guests. She put a coin in one of the dumplings, which increases the weight of the dumpling by 15 grams.
//Write a program that searches for a lucky dumpling.

import classwork_14.array_methods.ArrayMethods;

public class Task_2_LuckyDumpling {

    public static void main(String[] args) {

        int[] dumplings = new int[30];
        int coin = 15;

        int index = (int)(Math.random()*(30 - 1 + 1) + 1); //creating random index - it's a number of a dumpling in which we will put the coin

        dumplings[index] = coin; //putting the coin inside the dumpling

        ArrayMethods.printArray(dumplings);

        int luckyIndex =  ArrayMethods.linearSearch(dumplings, coin); //searching the heavy dumpling

        System.out.println("The lucky dumpling is the one with number " + (luckyIndex + 1));

    }//end of main

}//end of class
