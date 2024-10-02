package homework_09;

//Task 4. Write a bot program that helps throw garbage into bins of different colors:
//
//packaging in a yellow bin
//food waste in a brown bin
//paper in a green bin
//other waste in a black bin
// Use numbers to encode options for actions.

import java.util.Scanner;

public class Task_4_Garbage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while(flag){

            System.out.println("What kind of garbage do you want to waste?");
            System.out.println("1 -> Packaging");
            System.out.println("2 -> Bio waste");
            System.out.println("3 -> Paper");
            System.out.println("4 -> Other waste");
            System.out.println("0 -> Exit");

            int kindOfWaste = scanner.nextInt();

            switch(kindOfWaste){
                case 1 -> System.out.println("Throw packaging waste into the yellow bin.");
                case 2 -> System.out.println("Throw bio waste into the brown bin.");
                case 3 -> System.out.println("Throw paper waste into the green bin.");
                case 4 -> System.out.println("Throw other waste into the black bin.");
                case 0 -> flag = false;
            }

        }

    }//end of main

}//end of class
