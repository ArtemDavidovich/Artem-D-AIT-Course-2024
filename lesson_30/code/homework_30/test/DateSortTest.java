package homework_30.test;

//Задание 3.(*) В классе DateSortTest (см. код занятия), реализовать компаратор в методе setUp, чтобы тест был верный. Просьба не использовать Java Time API.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            String[] firstArray = s1.split("-");
            reverseArray(firstArray);
            String str1 = String.join("", firstArray);

            String[] secondArray = s2.split("-");
            reverseArray(secondArray);
            String str2 = String.join("", secondArray);

            return  str1.compareTo(str2);
        };
    }

    public String[] reverseArray(String[] array){
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
        return array;
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}
