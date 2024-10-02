package homework_13;

//Task 2. Flip a coin 100 times and count how many times it lands on heads and how many on tails.
//Write the results in an array.
//Calculate the probability of landing on heads and tails.

import java.util.Random;

public class Task_2_Coin {

    public static void main(String[] args) {

        //calling randomizer
        Random random = new Random();
        int[] coinThrow = new int[100];


        for (int i = 0; i < coinThrow.length; i++) {
            //using randomizer
            coinThrow[i] = random.nextInt(2); //0 - heads, 1 - tails
        }

        int sum = 0;

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < coinThrow.length; i++)
            {
                if (coinThrow[i] == j) sum++;
            }
            System.out.println(j + " = " + sum + "%");
            sum = 0;
        }

    }//end of main

}//end of class
