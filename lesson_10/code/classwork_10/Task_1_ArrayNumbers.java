package classwork_10;

//**Задача 1.**
//Создайте массив и заполните его целыми числами от 1 до 20.

public class Task_1_ArrayNumbers {

    public static void main(String[] args) {

        int[] array = new int[20]; // length = 20, indexes from 0 till 19

        // array[0] - 1st element of array
        // array.length = 20
        //array[array.length - 1] - last element of array

        //fill in array
        for (int i = 0; i < array.length; i++) {

            array[i] = i + 1;
            System.out.print(array[i] + " ");

        }

        System.out.println();

        //print array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }//end of main

}//end of class
