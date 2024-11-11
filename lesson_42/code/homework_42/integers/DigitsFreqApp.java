package homework_42.integers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {

    public static void main(String[] args) {

        Map<Integer, Integer> digitFrequency = new HashMap<>();

        // Initializing the map with digits 0-9, setting each frequency to 0
        for (int i = 0; i <= 9; i++) {
            digitFrequency.put(i, 0);
        }

        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            int number = 100 + random.nextInt(900); // Generates a number from 100 to 999

            String numberStr = Integer.toString(number); // Convert the number to a string and process each digit
            for (char digitChar : numberStr.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                digitFrequency.put(digit, digitFrequency.get(digit) + 1); // Update the frequency count for the digit
            }
        }

        System.out.println("Digit Frequency in One Million Numbers:");
        digitFrequency.forEach((digit, frequency) ->
                System.out.println("Digit " + digit + ": " + frequency));


    }//end of main

}//end of class
