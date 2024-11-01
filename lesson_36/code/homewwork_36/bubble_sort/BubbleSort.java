package homewwork_36.bubble_sort;

//Задача 1. Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?

import classwork_14.array_methods.ArrayMethods;

public class BubbleSort {

    public static void main(String[] args) {

        //Количество операций при добавлении одного ноля растет примерно на два ноля, т.е. в 100 раз

        int[] myArray_1 = ArrayMethods.fillRandomArray(0, 1000, 10);
        bubbleSort(myArray_1);

        int[] myArray_2 = ArrayMethods.fillRandomArray(0, 1000, 100);
        bubbleSort(myArray_2);

        int[] myArray_3 = ArrayMethods.fillRandomArray(0, 1000, 1000);
        bubbleSort(myArray_3);

        int[] myArray_4 = ArrayMethods.fillRandomArray(0, 1000, 10000);
        bubbleSort(myArray_4);

    }//end of main

    public static void bubbleSort(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){ //comparing two elements of array, if left element > right => swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}//end of class
