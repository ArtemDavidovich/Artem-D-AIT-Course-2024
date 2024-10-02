package classwork_11;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

public class Task_1_MinimumElement {

    public static void main(String[] args) {

        int[] array = {75, 34, -145, -123, 57, -145, 86, 77, 48, -145};
        int min = array[0]; //guess
        int indexMin = 0; //guess

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println(" Minimum element: " + min + ". Its index: " + indexMin + ".");

        int max = array[0];
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println(" Maximum element: " + max + ". Its index: " + indexMax + ".");

        int temp = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }//end of main

}//end of class
