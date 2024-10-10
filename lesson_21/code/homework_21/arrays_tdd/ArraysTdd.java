package homework_21.arrays_tdd;

//Задание 2. Разработайте тесты для методов обрабатывающих массивы:
//
//поиск минимального (максимального) элемента
//поиск индекса минимального (максимального) элемента

import java.util.Arrays;
import java.util.Objects;

public class ArraysTdd {

    private int[] array;

    public ArraysTdd(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArraysTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArraysTdd arraysTdd)) return false;
        return Objects.deepEquals(array, arraysTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //counting integers in array
    public int countIntegers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }

    //searching for minimum element of array
    public int searchMinimumElement(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //searching for maximum element of array
    public int searchMaximumElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //searching for index of minimum element of array
    public int searchIndexOfMinimumElement(int[] array){
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                indexMin = i;
            }
        }
        return indexMin;
    }

    //searching for index of maximum element of array
    public int searchIndexOfMaximumElement(int[] array){
        int max = array[0];
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                indexMax = i;
            }
        }
        return indexMax;
    }

}
