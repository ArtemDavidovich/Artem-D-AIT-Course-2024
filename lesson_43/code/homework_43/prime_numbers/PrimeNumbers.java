package homework_43.prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        List<Integer> primeNumbers = numbers.stream()
                .filter(number -> number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
                .toList();

        System.out.println(primeNumbers);

    }//end of main

}//end of class
