package homework_11;

//*Task 4.() Write a method that takes an array of integers and “unfolds” it.
//The last element becomes zero, second to last, first, etc.
//Hint: This method must modify the resulting array.

public class Task_4_UnfoldingMethod {

    public static void main(String[] args) {

        int[] array = new int[10];

        //filling and printing the basic array
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //calling the method for unfolding
        int[] unfoldedArray = unfoldingMethod(array);

        //printing the final result
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }

    }//end of main

    private static int[] unfoldingMethod(int[] array){

        for (int i = 0; i < array.length / 2; i++) { //searching for the middle of array, if we don't take the middle, then we will unfold the array twice
            int temp = array[i];
            array[i] = array[array.length - i - 1]; //swapping the first and the last element
            array[array.length - i - 1] = temp;
        }
        return array;
    }//end of unfoldingMethod

}//end of class
