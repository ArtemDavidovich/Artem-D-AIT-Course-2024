package homework_10;

//Task 4 (*)
//Given an array of integers: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38. Find the maximum array element and its index.

public class Task_4_Maximum {

    public static void main(String[] args) {

        int[] integers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int max = integers[0]; //variable for highest integer

        for (int i = 0; i < integers.length; i++) {
            if(integers[i] > max){ //cycle is looking through all variables step by step, comparing them and choosing the highest
            max = integers[i];
            }
        }

        System.out.println("The highest element of the array is: " + max);

        for (int i = 0; i < integers.length; i++) {
            if(integers[i] == 73){
                System.out.println(i); //when the value of the element is equal to 73, system will print out the number of that index
            }
        }

    }//end of main

}//end of class
