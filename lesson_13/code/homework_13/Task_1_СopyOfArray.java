package homework_13;

//Task 1. Write a method copyOfArray.
//The method takes as input an array of integers and an integer - the length of the new array newLength.
//The method must create a new array of length newLength
//The elements from the input array must be copied to the new array:
//Example: Initial array: {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> print {0, 1, 2}

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_СopyOfArray {

    public static void main(String[] args) {

        int[] initialArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer from 1 to 10: ");
        int newLength = scanner.nextInt();
        System.out.println("---------------------");

        int[] cutArray= copyOfArray(initialArray, newLength);
        System.out.print(Arrays.toString(cutArray)); //built-in method for printing arrays

    }//end of main

    private static int[] copyOfArray(int[] array, int n){
        int[] tempArray = new int[n + 1]; //new array with demanded length; n + 1 - while we start from 0
        for (int i = 0; i < array.length && i < tempArray.length; i++) {
            array[i] = i;
            tempArray[i] = array[i];
        }
        return tempArray;
    }

    //private static int[] copyOfArray(int[] array, int n){
    //        int[] tempArray = new int[n + 1]; //new array with demanded length; n + 1 - while we start from 0
    //        for (int i = 0, j = 0; i < array.length; i++) {
    //            array[i] = i;
    //            if(i < n + 1) {
    //                tempArray[j] = array[i];
    //                j++;
    //            }
    //        }
    //        return tempArray;
    //    }

}//end of class
