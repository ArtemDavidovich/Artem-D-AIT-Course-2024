package homework_22.random_numbers;

//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей. Реализуйте все подсчеты методами и напишите для них тесты.

import classwork_14.array_methods.ArrayMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    RandomNumbers randomNumbers;

    int[] array = ArrayMethods.fillRandomArray(-10,10,100);

    @BeforeEach
    void setUp() {
        randomNumbers = new RandomNumbers(array);
    }

    //while the array is random, we need to create separate counters inside the test

    @Test
    @DisplayName("Counting positive integers.")
    void testCountPositiveIntegers(){
        //expected
        int expected = 0;
        for (int n : array) {
            if(n > 0){
                expected++;
            }
        }
        //actual
        int actual = randomNumbers.countPositiveIntegers(array);
        assertEquals(expected, actual, "The number of expected and actual positive integers doesn't match.");
    }

    @Test
    @DisplayName("Counting negative integers.")
    void testCountNegativeIntegers(){
        //expected
        int expected = 0;
        for (int n : array) {
            if(n < 0){
                expected++;
            }
        }
        //actual
        int actual = randomNumbers.countNegativeIntegers(array);
        assertEquals(expected, actual, "The number of expected and actual negative integers doesn't match.");
    }

    @Test
    @DisplayName("Counting even integers.")
    void testCountEvenIntegers(){
        //expected
        int expected = 0;
        for (int n : array) {
            if(n % 2 == 0){
                expected++;
            }
        }
        //actual
        int actual = randomNumbers.countEvenIntegers(array);
        assertEquals(expected, actual, "The number of expected and actual even integers doesn't match.");
    }

    @Test
    @DisplayName("Counting zeros.")
    void testCountZeros(){
        //expected
        int expected = 0;
        for (int n : array) {
            if(n == 0){
                expected++;
            }
        }
        //actual
        int actual = randomNumbers.countZeros(array);
        assertEquals(expected, actual, "The number of expected and positive zeros doesn't match.");
    }

}//end of class