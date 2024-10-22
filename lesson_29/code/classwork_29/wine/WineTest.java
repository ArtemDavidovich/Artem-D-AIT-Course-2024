package classwork_29.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine[] wines;

    @BeforeEach
    void setUp() {

        wines = new Wine[5];
        wines[0] = new Wine("type1", "AAA", 2021, 6);
        wines[1] = new Wine("type2", "CCC", 2024, 3);
        wines[2] = new Wine("type3", "XXX", 2022, 5);
        wines[3] = new Wine("type1", "OOO", 2015, 7);
        wines[4] = new Wine("type2", "SSS", 2000, 20);

    }

    @Test
    void testSortWine() {
        System.out.println("------------------List wines as is--------------------");
        testPrintWine(); //print as is

        Arrays.sort(wines); //sorting

        System.out.println("------------------List wines sorted by age--------------------");
        testPrintWine(); //print
    }

    @Test
    void testSortWineByPrice(){
        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                return Double.compare(wine1.getPrice(), wine2.getPrice()) ;
            }
        };
        System.out.println("------------------List wines as is--------------------");
        testPrintWine(); //print as is

        Arrays.sort(wines, comparatorByPrice); //sorting

        System.out.println("------------------List wines sorted by price--------------------");
        testPrintWine(); //print
    }

    @Test
    void testSortWineByTitle(){
        Comparator<Wine> comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                return wine1.getTitle().compareTo(wine2.getTitle());
            }
        };
        System.out.println("------------------List wines as is--------------------");
        testPrintWine(); //print as is

        Arrays.sort(wines, comparatorByTitle); //sorting

        System.out.println("------------------List wines sorted by title--------------------");
        testPrintWine(); //print
    }

    @Test
    void testPrintWine(){
        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }

}//end of class