package homework_23.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers;
    int number = 13;

    @BeforeEach
    void setUp() {
        primeNumbers = new PrimeNumbers(number);
    }

    @Test
    @DisplayName("Checking if the number is prime")
    void testIsPrime(){
        boolean expected = true;
        assertEquals(expected, primeNumbers.isPrime(), "Number " + number + " is not prime.");
    }

}//end of class