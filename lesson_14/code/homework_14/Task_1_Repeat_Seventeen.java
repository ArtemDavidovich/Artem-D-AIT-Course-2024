package homework_14;

//Repeat: Problem 1. Find the product of all two-digit odd numbers that are multiples of 17.

import classwork_14.array_methods.ArrayMethods;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task_1_Repeat_Seventeen {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillConsequentArray(99);

        ArrayMethods.printArray(myArray);

        int seventeen = countDivisionBy17(myArray);

        System.out.println("The are " + seventeen + " two-digit numbers that are divisible by 17.");

        int[] finalArray = gatherDivisionBy17(myArray, seventeen);

        System.out.println("The array with two-digit numbers that are divisible by 17:");
        System.out.println(Arrays.toString(finalArray));

    }//end of main

    //searching for numbers that are divisible by 17
    public static int countDivisionBy17(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 17 == 0){
                count++;
            }
        }
        return count;
    }

    //making array with numbers that are divisible by 17
    public static int[] gatherDivisionBy17(int[] array, int n){
        int[] res = new int[n];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] % 17 == 0){
                res[j] = array[i];
                j++;
            }
        }
        return res;
    }

}//end of class
