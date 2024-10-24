package classwork_31.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    private void printArray(Object[] array, String titleOfReport){
        System.out.println("-----------------" + titleOfReport + "--------------------");
        for(Object element : array){
            System.out.println(element);
        }

    }

    @Test
    void testComparable(){
        printArray(cities, "List of cities as is");
        Arrays.sort(cities);
        printArray(cities, "List of cities sorted by population");
        City pattern = new City(null, 600_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName(){
        Comparator<City> comparatorName = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(cities, comparatorName);
        printArray(cities, "List of cities sorted by Name");
        City pattern = new City("Las Vegas", 0);
        int index = Arrays.binarySearch(cities, pattern, comparatorName);
        if(index > 0){
            System.out.println("Found " + pattern.getName() + " on index: " + index);
        } else{
            System.out.println("City " + pattern.getName() + " was not found, but it could be on index " + (- index - 1));
        }
        //System.out.println(index);
    }

    //Скопируйте массив в другой, имеющий в 2 раза большую длину.
    @Test
    void testArrayCopy(){
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy as is");
        Comparator<City> comparatorName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        //sorting
        Arrays.sort(citiesCopy, comparatorName);
        //printing
        printArray(citiesCopy, "citiesCopy after sorting by name");

        City pattern = new City("Salem", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length , pattern, comparatorName);
        System.out.println(index);
    }

    //Вставьте город Salem в список, сохранив порядок сортировки по населению.
    //вставляем в имеющийся список
    @Test
    void testInsertKeepSorting(){
        Arrays.sort(cities);
        printArray(cities, "Native sorting");
        //increase up to 7
        City[] citiesCopy7 = Arrays.copyOf(cities, cities.length + 1);
        City city = new City("New York", 8_500_000);
        int index = Arrays.binarySearch(citiesCopy7, 0, citiesCopy7.length - 1, city);
        index = index >= 0 ? index : - index - 1; //обработка индекса
        //подготовили место для вставки
        System.arraycopy(citiesCopy7, index, citiesCopy7, index + 1, citiesCopy7.length - index - 1);
        citiesCopy7[index] = city;
        cities = citiesCopy7; //переопределили ссылку на массив
        printArray(cities, "List with added city");

    }

}//end of class