package homework_22.random_numbers;

//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей. Реализуйте все подсчеты методами и напишите для них тесты.

import java.util.Arrays;
import java.util.Objects;

public class RandomNumbers {

   private int[] array;

    public RandomNumbers(int[] array) {
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
        return "RandomNumbers{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomNumbers that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    public int countPositiveIntegers(int[] array){
        int count = 0;
        for (int n : array) {
            if(n > 0){
                count++;
            }
        }
        return count;
    }

    public int countNegativeIntegers(int[] array){
        int count = 0;
        for (int n : array) {
            if(n < 0){
                count++;
            }
        }
        return count;
    }

    public int countEvenIntegers(int[] array){
        int count = 0;
        for (int n : array) {
            if(n % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public int countZeros(int[] array){
        int count = 0;
        for (int n : array) {
            if(n == 0){
                count++;
            }
        }
        return count;
    }

}//end of class
