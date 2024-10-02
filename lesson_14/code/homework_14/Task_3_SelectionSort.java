package homework_14;

//Problem 3. ()* Find the selection sort algorithm on the Internet.
//https://www.geeksforgeeks.org/selection-sort/ Give an array of random integers.
//Implement a method that receives an array as input and sorts it using the selection sort algorithm.

import classwork_14.array_methods.ArrayMethods;

public class Task_3_SelectionSort {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillRandomArray(1,50,10);

        ArrayMethods.printArray(myArray);

        ArrayMethods.selectionSort(myArray);

        ArrayMethods.printArray(myArray);

    }//end of main

}//end of class
