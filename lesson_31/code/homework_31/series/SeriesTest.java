package homework_31.series;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    Series[] series;

    @BeforeEach
    void setUp() {
        series = new Series[6];
        series[0] = new Series("Santa Barbara", 2137);
        series[1] = new Series("Friends", 236);
        series[2] = new Series("Breaking Bad", 62);
        series[3] = new Series("Game of Thrones", 73);
        series[4] = new Series("The Office", 201);
        series[5] = new Series("Stranger Things", 34);
    }

    private void printArray(Object[] array, String titleOfReport){
        System.out.println("-----------------" + titleOfReport + "--------------------");
        for(Object element : array){
            System.out.println(element);
        }
    }

    @Test
    void testComparable(){
        printArray(series, "Series as is");
        Arrays.sort(series);
        printArray(series, "Series after native sorting");
    }

    @Test
    void testComparatorByName(){
        Comparator<Series> comparatorName = new Comparator<Series>() {
            @Override
            public int compare(Series o1, Series o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(series, comparatorName);
        printArray(series, "Series after sorting by name");

        Series pattern = new Series("The Office", 0);
        int index = Arrays.binarySearch(series, pattern, comparatorName);
        if(index > 0){
            System.out.println("Found " + pattern.getName() + " on index: " + index);
        } else{
            System.out.println("Series " + pattern.getName() + " was not found, but it could be on index " + (- index - 1));
        }
    }

    @Test
    void testArrayCopy(){
        Series[] seriesCopy = Arrays.copyOf(series, series.length * 2);
        printArray(seriesCopy, "seriesCopy as is");
        Comparator<Series> comparatorName = Comparator.nullsLast((s1, s2) -> s1.getName().compareTo(s2.getName()));
        Arrays.sort(seriesCopy, comparatorName);
        printArray(seriesCopy, "seriesCopy after sorting by name");

        Series pattern = new Series("The Simpsons", 0);
        int index = Arrays.binarySearch(seriesCopy, 0, series.length, pattern, comparatorName);
        if(index > 0){
            System.out.println("Found " + pattern.getName() + " on index: " + index);
        } else{
            System.out.println("Series " + pattern.getName() + " was not found, but it could be on index " + (- index - 1));
        }
    }

    @Test
    void testInsertKeepSorting(){
        Arrays.sort(series);
        Series[] seriesCopy7 = Arrays.copyOf(series, series.length + 1);
        Series newSeries = new Series("The Simpsons", 750);
        int index = Arrays.binarySearch(seriesCopy7, 0, seriesCopy7.length - 1, newSeries);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(seriesCopy7, index, seriesCopy7, index + 1, seriesCopy7.length - index - 1);
        seriesCopy7[index] = newSeries;
        series = seriesCopy7;
        printArray(series, "Series after adding a new element");

    }

}//end of class