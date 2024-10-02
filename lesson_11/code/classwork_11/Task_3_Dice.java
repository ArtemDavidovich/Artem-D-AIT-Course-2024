package classwork_11;

//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Arrays;
import java.util.Random;

public class Task_3_Dice {

    public static void main(String[] args) {

        Random random = new Random(); //calling and making randomizer

        int[] toss = new int[20];

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        //fill in
        for (int i = 0; i < toss.length; i++) {
            //calling randomizer
            toss[i] = random.nextInt(6) + 1; //range between 0 and 5 included, +1 - makes range between 1 and 6
            System.out.print(toss[i]);
            if(i < toss.length - 1) {
                System.out.print(", ");
            }
                if (toss[i] == 1) {
                    count1++;
                } else if (toss[i] == 2) {
                    count2++;
                } else if (toss[i] == 3) {
                    count3++;
                } else if (toss[i] == 4) {
                    count4++;
                } else if (toss[i] == 5) {
                    count5++;
                } else if (toss[i] == 6) {
                    count6++;
                }
        }

        System.out.println();

        System.out.println(Arrays.toString(toss));

        System.out.println("1 dot -> " + count1 + " times, " + (count1 / (double) toss.length * 100) + "%");
        System.out.println("2 dot -> " + count2 + " times, " + (count2 / (double) toss.length * 100) + "%");
        System.out.println("3 dot -> " + count3 + " times, " + (count3 / (double) toss.length * 100) + "%");
        System.out.println("4 dot -> " + count4 + " times, " + (count4 / (double) toss.length * 100) + "%");
        System.out.println("5 dot -> " + count5 + " times, " + (count5 / (double) toss.length * 100) + "%");
        System.out.println("6 dot -> " + count6 + " times, " + (count6 / (double) toss.length * 100) + "%");

        //calculate results of tossing
        int[] res = new int[6]; //array for results
        for (int i = 0; i < toss.length; i++) {
            switch(toss[i]){
                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if(i < res.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //variant with 2 cycles
        int sum = 0;

        for (int j = 1; j <= 6; j++)
        {
            for (int i = 0; i < toss.length; i++)
            {
                if (toss[i] == j) sum++;
            }
            System.out.println(j + " = " + sum);
            sum = 0;
        }

    }//end of main

    int sum = 0;



}//end of class
