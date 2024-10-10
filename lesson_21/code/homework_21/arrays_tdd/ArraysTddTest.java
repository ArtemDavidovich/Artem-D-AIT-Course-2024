package homework_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTddTest {

    ArraysTdd arrayTdd;
    int[] array = {10, -10, 5, -20, 30}; //3

    @BeforeEach
    void setUp() {

        arrayTdd = new ArraysTdd(array);

    }

    @Test
    void countIntegersTest() {

        //expected
        int expected = 5;

        //actual
        int actual = arrayTdd.countIntegers(array);

        assertEquals(expected, actual, "Bad Info: ");
    }

    @Test
    @DisplayName("Searching for minimum element of array")
    void searchMinimumElementTest(){
        //expected
        int expected = -20;

        //actual
        int actual = arrayTdd.searchMinimumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for maximum element of array")
    void searchMaximumElementTest(){
        //expected
        int expected = 30;

        //actual
        int actual = arrayTdd.searchMaximumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for index of minimum element of array")
    void searchIndexOfMinimumElementTest(){
        //expected
        int expected = 3;

        //actual
        int actual = arrayTdd.searchIndexOfMinimumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for index of maximum element of array")
    void searchIndexOfMaximumElementTest(){
        //expected
        int expected = 4;

        //actual
        int actual = arrayTdd.searchIndexOfMaximumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

}