package homework_29.odd_even_comparator;

import classwork_14.array_methods.ArrayMethods;

import java.util.Arrays;

public class UsualClass {

    public static void main(String[] args) {

        OddEvenComparator comparatorOddEven = new OddEvenComparator();

        int[] array = ArrayMethods.fillRandomArray(1,100,10);
        Integer[] newArray = new Integer[array.length];
        for (int i = 0, j = 0; j < newArray.length; i++, j++) {
             newArray[j] = array[i];
        }

        Arrays.sort(newArray, comparatorOddEven);

        System.out.println(Arrays.toString(array));
        System.out.println("============================");
        System.out.println(Arrays.toString(newArray));

    }//end of main

}//end of class
