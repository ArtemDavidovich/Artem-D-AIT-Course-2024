package homework_11;

//Task 2
//The shooter has 10 attempts to hit the target. Simulate 10 shots using a random number sensor.
//Answer the question, how many points did the shooter score? Did he ever hit the center of the target?

import java.util.Random;

public class Task_2_Shooter {

    public static void main(String[] args) {

        Random random = new Random(); //calling randomizer

        int[] shots = new int[10];
        int sum = 0; //sum of shots' points
        boolean centre = false; //variable for check, if the shooter hit in the centre of the target

        for (int i = 0; i < shots.length; i++) {
            shots[i] = random.nextInt(11); //10 - centre of the target, 1 - last sector of the target, 0 - shot off the target
            sum = sum + shots[i];
            System.out.print(shots[i] + " "); //output for check
            if(shots[i] == 10){
                centre = true;
                }
        }

        System.out.println();

        System.out.println("The sum of shooter's points is: " + sum);

        if(centre == true){
            System.out.println("The shooter managed to hit the centre of the target.");
        } else {
            System.out.println("The shooter didn't manage to hit the centre of the target.");
        }

    }//end of main

}//end of class
