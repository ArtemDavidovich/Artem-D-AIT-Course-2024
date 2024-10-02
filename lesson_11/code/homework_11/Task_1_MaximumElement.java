package homework_11;

//Task 1
//Given an array of integers: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
//Find the maximum array element and its index.

public class Task_1_MaximumElement {

    public static void main(String[] args) {

        int[] array = {83, 65, 37, 51, -17, 73, -41, 83, 52, 56, -55, 83};
        int[] arrayOfIndex = new int[array.length]; //2nd array for checking, if the highest element meets more than once

        int max = array[0]; //variable for maximum element
        int j = 0; //variable for number of index(es)

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        //separate cycle, cause we don't know the exact value of maximum element
        for (int i = 0; i < array.length; i++) {
            if(max == array[i]){
                arrayOfIndex[j] = i; //putting the index into 2nd array
                j++; //increasing the index of 2nd array
            }
        }

        System.out.print("Maximum element: " + max + ". Its index(es): ");

        for (int i = 0; i < j; i++) {
            System.out.print(arrayOfIndex[i] + " ");
        }

    }//end of main

}//end of class
