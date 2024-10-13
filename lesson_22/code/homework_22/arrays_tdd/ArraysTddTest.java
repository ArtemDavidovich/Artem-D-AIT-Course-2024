package homework_22.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTddTest {

    ArraysTdd arrayTdd;
    int[] array = {10, -10, 5, -20, 30, -12};

    @BeforeEach
    void setUp() {

        arrayTdd = new ArraysTdd(array);

    }

    @Test
    @DisplayName("Searching for 5th element of array.")
    void testFindFiveElement(){
        //expected
        int expected = 30;

        //actual
        int actual = arrayTdd.findFiveElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Counting number of elements with odd index.")
    void testCountOddIndex(){
        //expected
        int expected = 3;

        //actual
        int actual = arrayTdd.countOddIndex(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    void testCountIntegers() {

        //expected
        int expected = 3;

        //actual
        int actual = arrayTdd.countPositiveIntegers(array);

        assertEquals(expected, actual, "Bad Info: ");
    }

    @Test
    @DisplayName("Searching for minimum element of array")
    void testSearchMinimumElement(){
        //expected
        int expected = -20;

        //actual
        int actual = arrayTdd.searchMinimumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for maximum element of array")
    void testSearchMaximumElement(){
        //expected
        int expected = 30;

        //actual
        int actual = arrayTdd.searchMaximumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for index of minimum element of array")
    void testSearchIndexOfMinimumElement(){
        //expected
        int expected = 5;

        //actual
        int actual = arrayTdd.searchIndexOfMinimumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

    @Test
    @DisplayName("Searching for index of maximum element of array")
    void testSearchIndexOfMaximumElement(){
        //expected
        int expected = 4;

        //actual
        int actual = arrayTdd.searchIndexOfMaximumElement(array);

        assertEquals(expected, actual, "ERROR");
    }

}