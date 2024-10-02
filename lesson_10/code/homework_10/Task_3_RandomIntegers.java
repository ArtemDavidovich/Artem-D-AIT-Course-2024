package homework_10;

//Task 3
//Create an array of 20 random integers ranging from 10 to 20.
//Print the array. Swap the first and last elements of the array and print the array again.

public class Task_3_RandomIntegers {

    public static void main(String[] args) {

        int[] randomIntegers = new int[20];

        for (int i = 0; i < randomIntegers.length; i++) {
          randomIntegers[i] = (int)(Math.random()*(20 - 10 + 1) + 10); // randomizer int n = (int) (Math.random()*(b-a+1)+a);
            System.out.print(randomIntegers[i] + " ");
        }

        System.out.println();

        //swapping first and last element of array
        int temp = randomIntegers[0]; //buffer variable for swapping elements
        randomIntegers[0] = randomIntegers[randomIntegers.length - 1];
        randomIntegers[randomIntegers.length - 1] = temp;

        for (int i = 0; i < randomIntegers.length; i++) {
            System.out.print(randomIntegers[i] + " ");
        }

    }//end of main

}//end of class
