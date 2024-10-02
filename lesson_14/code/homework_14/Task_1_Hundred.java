package homework_14;

//Problem 1. Fill the array with integers from 1 to 100.
//Create a second array with a size 1 larger than the existing one.
//Copy the first array to the new array. Add a random integer from 1 to 100 to a random place in the original array.
//Find the shortest way to find the number that was added to the array.

import classwork_14.array_methods.ArrayMethods;

public class Task_1_Hundred {

    public static void main(String[] args) {

        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        ArrayMethods.printArray(myArray);

        int[] oneMoreArray = new int[myArray.length + 1];

        for (int i = 0, j = 0; i < myArray.length; i++, j++) { //copying the first array to the second one
            oneMoreArray[j] = myArray[i];
        }

        ArrayMethods.printArray(oneMoreArray);

        int number = (int)(Math.random()*(100 - 1 + 1) + 1); //creating random number
        int index = (int)(Math.random()*(100 - 1 + 1) + 1); //creating random index - it's a place where our random number will be put

        for (int i = oneMoreArray.length - 1; i > index; i--) { //putting the random number inside the array
            oneMoreArray[i] = oneMoreArray[i - 1];
        }

        ArrayMethods.printArray(oneMoreArray);

        int x = lookingForRandomNumber(myArray, oneMoreArray);

        System.out.println("The random number is: " + x);

    }//end of main

    //method where we will compare two arrays to find the random number
    private static int lookingForRandomNumber(int[] myArray, int[] oneMoreArray){
        for (int i = 0, j = 0; i < myArray.length; i++, j++) {
            if(myArray[i] != oneMoreArray[j]){
                return oneMoreArray[i];
            }
        }
        return -1;
    }

}//end of class
