package homework_08;

//Task 2. Print out all natural numbers less than 200 and multiples of 13.

public class Task_2_NaturalNumbers {

    public static void main(String[] args) {

        int i = 13; //cycle parameter
        int end = 200;

        while(i < end){
            if(i % 13 == 0){
                System.out.print(i + " ");
            }
            i++;
        }

        i = 13;
        System.out.println();

        do {
            if(i % 13 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < end);

    }//end of main

}//end of class
