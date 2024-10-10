package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
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
    void countIntegers() {

        //expected
        int expected = 5;

        //actual
        int actual = arrayTdd.countIntegers(array);

        assertEquals(expected, actual, "Bad Info: ");



    }
}