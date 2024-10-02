package homework_10;

//Task 2
//Fill the array with even numbers from 0 to 50. Print the array in ascending order, then in descending order.

public class Task_2_EvenNumbers {

    public static void main(String[] args) {

        //array with hand filling

        int[] evenNumbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48 , 50};

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        for (int i = 25; i >= 0 ; i--) { //int i = array.length - 1
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        //array with autofilling
        int[] evenNumbers2 = new int[26];

        for (int i = 0, step = 0; step <= 50; i++, step += 2) { //we need to add extra variables for different steps
            evenNumbers2[i] = step;
            System.out.print(evenNumbers2[i] + " ");
        }

        System.out.println();

        for (int i = evenNumbers2.length - 1; i >=0 ; i--) {
            System.out.print(evenNumbers2[i] + " ");
        }



    }//end of main

}//end of class
