package classwork_14.array_methods;

//**Задача 1.**
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Выполните сортировку полученного массива.
//Попало ли число 0 в этот массив? (выяснить с помощью binary search)
//Если да, то на какое место (индекс) в массиве?
//Если нет, то на какой индекс его следует поставить?

public class Task_1_RandomNumbers {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillRandomArray(-100,100,20);
        ArrayMethods.printArray(myArray); //print
        ArrayMethods.bubbleSort(myArray); //sort
        ArrayMethods.printArray(myArray); //print
        int zero = ArrayMethods.binarySearch(myArray, 0);
        zero = (zero > 0) ? zero : -zero - 1;
        System.out.println(zero);

    }//end of main

}//end of class
