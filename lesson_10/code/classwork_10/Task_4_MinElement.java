package classwork_10;

public class Task_4_MinElement {

    public static void main(String[] args) {

        int[] ages = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        int min = ages[0];

        for (int i = 0; i < ages.length; i++) {

            if(ages[i] < min){
                min = ages[i];
            }
        }
        System.out.println("Min age = " + min);

        int max = ages[0];

        for (int i = 0; i < ages.length; i++) {

            if(ages[i] > max){
                max = ages[i];
            }
        }
        System.out.println("Max age = " + max);

    }//end of main

}//end of class
